// Copyright 2000-2023 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.
package org.jetbrains.plugins.terminal.exp

import com.intellij.openapi.Disposable
import com.intellij.openapi.util.Disposer
import java.util.concurrent.CopyOnWriteArrayList
import kotlin.properties.Delegates

internal class TerminalSelectionModel(outputModel: TerminalOutputModel) {
  /** Expected, that last element in the list is primary selection */
  var selectedBlocks: List<CommandBlock> by Delegates.observable(emptyList()) { _, oldValue, newValue ->
    if (newValue != oldValue) {
      listeners.forEach { it.selectionChanged(oldValue, newValue) }
    }
  }

  val primarySelection: CommandBlock?
    get() = selectedBlocks.lastOrNull()

  private val listeners: MutableList<TerminalSelectionListener> = CopyOnWriteArrayList()

  init {
    outputModel.addListener(object : TerminalOutputModelListener {
      override fun blockRemoved(block: CommandBlock) {
        selectedBlocks -= block
      }
    })
  }

  fun addListener(listener: TerminalSelectionListener, disposable: Disposable? = null) {
    listeners.add(listener)
    if (disposable != null) {
      Disposer.register(disposable) { listeners.remove(listener) }
    }
  }

  interface TerminalSelectionListener {
    fun selectionChanged(oldSelection: List<CommandBlock>, newSelection: List<CommandBlock>) {}
  }
}