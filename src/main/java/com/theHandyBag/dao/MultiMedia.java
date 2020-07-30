/**
 * 
 */
package com.theHandyBag.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.theHandyBag.model.Multi_Medi_Type;

/**
 * @author Kumar
 *

	Jul 29, 2020
 */
public interface MultiMedia extends JpaRepository<Multi_Medi_Type, Integer> {

}
