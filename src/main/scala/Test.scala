import com.strategy.duck.fly.{FlyWithWings, FlyRocketPowered}
import com.strategy.duck.quack.Quack
import com.strategy.duck.{ModelDuck, MallardDuck, Duck}
import com.strategy.game.{King, Queen, Character}
import com.strategy.game.weapon.{SwordBehavior, BowAndArrowBehavior}

/**
  * Created by zheng on 3/30/16.
  */
object Test {
  def main(args: Array[String]): Unit = {
    val mallard: Duck = new MallardDuck
    mallard.performQuack
    mallard.performFly
    mallard.setQuackBehavior(new Quack)
    mallard.performQuack
    mallard.display

    println("")
    val modelDuck: Duck = new ModelDuck
    modelDuck.performFly
    modelDuck.setFlyBehavior(new FlyRocketPowered)
    modelDuck.performFly
    modelDuck.setFlyBehavior(new FlyWithWings)
    modelDuck.performFly

    println("")
    val queen: com.strategy.game.Character = new Queen
    queen.fight()
    queen.setWeapenBehavior(new BowAndArrowBehavior)
    queen.fight()

    println("")
    val king: Character= new King()
    king.fight()
    king.setWeapenBehavior(new SwordBehavior)
    king.fight()

  }
}
