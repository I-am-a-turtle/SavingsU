//
//  ViewController.swift
//  SavingsU
//
//  Created by Kiersten Campbell, Arselyne Chery, Karmen Liang, Vicky Liu, Grace Mazzarella on 1/27/18.
//  Copyright © 2018 Kiersten Campbell, Arselyne Chery, Karmen Liang, Vicky Liu, Grace Mazzarella. All rights reserved.
//

import UIKit

class ViewController: UIViewController {

    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }

    @IBAction func SpendingHistory(_ sender: Any) {
        performSegue(withIdentifier: "toSpendingHistory", sender: self)
    }

    @IBAction func SpendingEvent(_ sender: UIButton) {
        performSegue(withIdentifier: "toSpendingEvent", sender: self)
    }
    @IBAction func SavingsGoals(_ sender: UIButton) {
        performSegue(withIdentifier: "toSavingsGoals", sender: self)
    }
}
