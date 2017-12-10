/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.PairOff;
import com.tools20022.repository.entity.SecuritiesSettlement;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between a turnaround and pair-off quantity for instructing a one to
 * many and many to many (partial) pair-off or turnaround.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PairedOrTurnedQuantity3Choice#mmPairedOffQuantity
 * PairedOrTurnedQuantity3Choice.mmPairedOffQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PairedOrTurnedQuantity3Choice#mmTurnedQuantity
 * PairedOrTurnedQuantity3Choice.mmTurnedQuantity}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
 * SecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PairedOrTurnedQuantity3Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between a turnaround and pair-off quantity for instructing a one to many and many to many (partial) pair-off or turnaround."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "PairedOrTurnedQuantity3Choice", propOrder = {"pairedOffQuantity", "turnedQuantity"})
public class PairedOrTurnedQuantity3Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected FinancialInstrumentQuantity1Choice pairedOffQuantity;
	/**
	 * Quantity of financial instruments of the linked transaction to be
	 * paired-off.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice
	 * FinancialInstrumentQuantity1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PairOff#mmPairedOffQuantity
	 * PairOff.mmPairedOffQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PairedOrTurnedQuantity3Choice
	 * PairedOrTurnedQuantity3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PairdOffQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PairedOffQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of financial instruments of the linked transaction to be paired-off."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPairedOffQuantity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PairOff.mmPairedOffQuantity;
			componentContext_lazy = () -> PairedOrTurnedQuantity3Choice.mmObject();
			isDerived = false;
			xmlTag = "PairdOffQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PairedOffQuantity";
			definition = "Quantity of financial instruments of the linked transaction to be paired-off.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice.mmObject();
		}
	};
	protected FinancialInstrumentQuantity1Choice turnedQuantity;
	/**
	 * Quantity of financial instruments of the linked transaction to be turned.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice
	 * FinancialInstrumentQuantity1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmTurnedQuantity
	 * SecuritiesSettlement.mmTurnedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PairedOrTurnedQuantity3Choice
	 * PairedOrTurnedQuantity3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrndQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TurnedQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of financial instruments of the linked transaction to be turned."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTurnedQuantity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmTurnedQuantity;
			componentContext_lazy = () -> PairedOrTurnedQuantity3Choice.mmObject();
			isDerived = false;
			xmlTag = "TrndQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TurnedQuantity";
			definition = "Quantity of financial instruments of the linked transaction to be turned.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PairedOrTurnedQuantity3Choice.mmPairedOffQuantity, PairedOrTurnedQuantity3Choice.mmTurnedQuantity);
				trace_lazy = () -> SecuritiesSettlement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PairedOrTurnedQuantity3Choice";
				definition = "Choice between a turnaround and pair-off quantity for instructing a one to many and many to many (partial) pair-off or turnaround.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "PairdOffQty")
	public FinancialInstrumentQuantity1Choice getPairedOffQuantity() {
		return pairedOffQuantity;
	}

	public void setPairedOffQuantity(com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice pairedOffQuantity) {
		this.pairedOffQuantity = pairedOffQuantity;
	}

	@XmlElement(name = "TrndQty")
	public FinancialInstrumentQuantity1Choice getTurnedQuantity() {
		return turnedQuantity;
	}

	public void setTurnedQuantity(com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice turnedQuantity) {
		this.turnedQuantity = turnedQuantity;
	}
}