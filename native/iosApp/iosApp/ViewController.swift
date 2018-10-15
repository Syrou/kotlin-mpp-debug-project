//
//  ViewController.swift
//  iosApp
//
//  Created by Joakim Forslund on 2018-10-11.
//  Copyright © 2018 Joakim Forslund. All rights reserved.
//

import UIKit
import SharedCode

class ViewController: UIViewController {
    @IBOutlet var label:UILabel!
    
    @IBAction func pressed(sender: AnyObject){
        label.text = "Herpa"
        CommonKt.AnimalTest(test: Test.rabbit)
    }
    override func viewDidLoad() {
        super.viewDidLoad()
        
        let label = UILabel(frame: CGRect(x: 0, y: 0, width: 300, height: 21))
        label.center = CGPoint(x: 160, y: 285)
        label.textAlignment = .center
        label.font = label.font.withSize(25)
        label.text = CommonKt.createApplicationScreenMessage()
        view.addSubview(label)
    }


}

