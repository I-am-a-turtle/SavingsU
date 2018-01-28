//
//  SpendingHistoryViewController.swift
//  SavingsU
//
//  Created by Kiersten Campbell on 1/27/18.
//  Copyright © 2018 Kiersten Campbell. All rights reserved.
//

import UIKit

class SpendingEventViewController: UIViewController {
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
    }
    
    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }

    @IBAction func EventToMenu(_ sender: UIButton) {
        performSegue(withIdentifier: "EventToMenu", sender: self)
    }
}
