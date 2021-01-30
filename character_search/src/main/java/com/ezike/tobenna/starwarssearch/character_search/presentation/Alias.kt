package com.ezike.tobenna.starwarssearch.character_search.presentation

import com.ezike.tobenna.starwarssearch.character_search.presentation.detail.CharacterDetailViewResult
import com.ezike.tobenna.starwarssearch.character_search.presentation.detail.CharacterDetailViewState
import com.ezike.tobenna.starwarssearch.character_search.presentation.search.SearchViewResult
import com.ezike.tobenna.starwarssearch.character_search.presentation.search.SearchViewState
import com.ezike.tobenna.starwarssearch.presentation.mvi.base.IntentProcessor
import com.ezike.tobenna.starwarssearch.presentation.mvi.base.ViewStateReducer
import com.ezike.tobenna.starwarssearch.presentation.mvi.stateMachine.StateMachine
import com.ezike.tobenna.starwarssearch.presentation_android.ComponentManager

typealias SearchIntentProcessor =
    @JvmSuppressWildcards IntentProcessor<SearchViewResult>

typealias SearchStateReducer =
    @JvmSuppressWildcards ViewStateReducer<SearchViewState, SearchViewResult>

typealias SearchStateMachine =
    @JvmSuppressWildcards StateMachine<SearchViewState, SearchViewResult>

typealias SearchComponentManager =
    @JvmSuppressWildcards ComponentManager<SearchViewState, SearchViewResult>

typealias CharacterDetailIntentProcessor =
    @JvmSuppressWildcards IntentProcessor<CharacterDetailViewResult>

typealias CharacterDetailStateReducer =
    @JvmSuppressWildcards ViewStateReducer<CharacterDetailViewState, CharacterDetailViewResult>

typealias CharacterDetailStateMachine =
    @JvmSuppressWildcards StateMachine<CharacterDetailViewState, CharacterDetailViewResult>

typealias DetailComponentManager =
    @JvmSuppressWildcards ComponentManager<CharacterDetailViewState, CharacterDetailViewResult>
