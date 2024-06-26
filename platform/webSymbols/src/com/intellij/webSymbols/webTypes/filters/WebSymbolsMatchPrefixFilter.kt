// Copyright 2000-2022 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.
package com.intellij.webSymbols.webTypes.filters

import com.intellij.webSymbols.WebSymbol
import com.intellij.webSymbols.WebSymbolsScope
import com.intellij.webSymbols.completion.WebSymbolCodeCompletionItem
import com.intellij.webSymbols.query.WebSymbolsQueryExecutor
import org.jetbrains.annotations.ApiStatus

@ApiStatus.Internal
class WebSymbolsMatchPrefixFilter : WebSymbolsFilter {

  override fun filterCodeCompletions(codeCompletions: List<WebSymbolCodeCompletionItem>,
                                     queryExecutor: WebSymbolsQueryExecutor,
                                     scope: List<WebSymbolsScope>,
                                     properties: Map<String, Any>): List<WebSymbolCodeCompletionItem> {
    val prefix = properties["prefix"] as? String ?: return codeCompletions
    return codeCompletions.filter { it.name.startsWith(prefix) }
  }

  override fun filterNameMatches(matches: List<WebSymbol>,
                                 queryExecutor: WebSymbolsQueryExecutor,
                                 scope: List<WebSymbolsScope>,
                                 properties: Map<String, Any>): List<WebSymbol> {
    val prefix = properties["prefix"] as? String ?: return matches
    return matches.filter { it.name.startsWith(prefix) }
  }

}