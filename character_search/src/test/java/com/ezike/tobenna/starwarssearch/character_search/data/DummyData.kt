package com.ezike.tobenna.starwarssearch.character_search.data

import com.ezike.tobenna.starwarssearch.character_search.model.CharacterModel
import com.ezike.tobenna.starwarssearch.lib_character_search.domain.model.Character
import com.ezike.tobenna.starwarssearch.lib_character_search.domain.model.CharacterDetail
import com.ezike.tobenna.starwarssearch.lib_character_search.domain.model.Film
import com.ezike.tobenna.starwarssearch.lib_character_search.domain.model.Planet
import com.ezike.tobenna.starwarssearch.lib_character_search.domain.model.Specie
import com.ezike.tobenna.starwarssearch.testutils.ERROR_MSG
import java.net.SocketTimeoutException

internal object DummyData {
    val characterModel = CharacterModel(
        "Many men",
        "34.BBY",
        "143",
        "https://swapi.dev/people/21"
    )

    val character = Character(
        "Many men",
        "34.BBY",
        "143",
        "https://swapi.dev/people/21"
    )

    val characterList: List<Character> = listOf(character)

    const val query = "Luke"

    val characterDetail = CharacterDetail(
        listOf("www.url.com"),
        "http://swapi.dev/planet",
        listOf("https://swapi.dev.people"),
        "https://swapi.dev/people/12/"
    )

    val film = Film(
        "Some title",
        "An opening crawl"
    )

    val films: List<Film> = listOf(
        Film(
            "Some title",
            "An opening crawl"
        )
    )

    val planet = Planet(
        "tatooine",
        "1000000"
    )

    val specie = Specie(
        "Iroko",
        "Yoruba",
        "Enugu"
    )

    val species = listOf(
        Specie(
            "Iroko",
            "Yoruba",
            "Enugu"
        )
    )
    val filmModel = FilmModel(
        "Some title",
        "An opening crawl"
    )

    val planetModel = PlanetModel(
        "tatooine",
        "1000000"
    )

    val specieModel = SpecieModel(
        "Iroko",
        "Yoruba",
        "Enugu"
    )

    val exception: SocketTimeoutException
        get() = SocketTimeoutException(ERROR_MSG)
}
