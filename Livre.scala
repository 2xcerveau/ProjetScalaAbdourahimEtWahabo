package IMSD.Projet.Scala

class Livre (val titre : String, val auteur : String, val annéeDePublication : String,var estEmprunté : Boolean=false) {


  def emprunter(): Unit = {


    if (estEmprunté==false) {

      estEmprunté = true
      println(s" Le livre $titre emprunté avec succès")

    } else {

      println(s"Le livre $titre  déjà emprunté ")
    }

  }

  def rendre(): Unit = {

    if (estEmprunté==true) {
      println(s"le Livre $titre est rendu avec succès")
      estEmprunté = false

    }
    else {
      println(s" Le livre $titre n'est pas emprunté (pas possible de le rendre) ou est déjà rendu")
    }

  }
}
