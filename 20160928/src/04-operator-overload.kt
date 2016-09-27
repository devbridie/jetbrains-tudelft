import java.util.*

class Tile

class Board {
    private val tiles = ArrayList<List<Tile>>()

    operator fun get(x: Int, y: Int): Tile {
        if (x >= tiles.size || y >= tiles[x].size) {
            throw RuntimeException("Tile at ($x, $y) does not exist!")
        }
        return tiles[x][y]
    }
}

fun main(args: Array<String>) {
    val board = Board()

    val tile = board[0, 0]
}