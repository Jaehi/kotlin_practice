package Inheritance

import java.awt.Graphics
import java.awt.Shape
import javax.swing.text.Element
import javax.swing.text.Position
import javax.swing.text.View

class MyView(elem: Element?) : View(elem) {
    override fun getPreferredSpan(axis: Int): Float {
        TODO("Not yet implemented")
    }

    override fun paint(g: Graphics?, allocation: Shape?) {
        TODO("Not yet implemented")
    }

    override fun modelToView(pos: Int, a: Shape?, b: Position.Bias?): Shape {
        TODO("Not yet implemented")
    }

    override fun viewToModel(x: Float, y: Float, a: Shape?, biasReturn: Array<out Position.Bias>?): Int {
        TODO("Not yet implemented")
    }
}