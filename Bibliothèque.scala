package IMSD.Projet.Scala
import scala.io.StdIn


class Bibliothèque (var listeDeLivre : List[Livre]=List()) {

  def ajouterLivre(livre: Livre) = {

    listeDeLivre = livre :: listeDeLivre
    println(s"Ajout d'un nouveau Livre intitulé ${livre.titre}")
  }

  def emprunterLivre(titreDuLivreEmprunté: String): Unit = {



    listeDeLivre.find { livre => livre.titre == titreDuLivreEmprunté
    } match {
      case Some(livre) => livre.emprunter()
      case Some(_) => println(s"Le livre $titreDuLivreEmprunté déja emprunté ")
      case None => print(s"Le livre $titreDuLivreEmprunté est introuvable \n")
    }

  }

  def rendreLivre(titreDuLivreRendu: String): Unit = {
    listeDeLivre.find {livre => livre.titre==titreDuLivreRendu
    } match {
      case Some(livre) => livre.rendre()
      case None => println(s"Le livre $titreDuLivreRendu n'appartient pas à cette bibliothèque")
      case Some(_) => print(s"$titreDuLivreRendu déjà rendu")
    }
  }

}


