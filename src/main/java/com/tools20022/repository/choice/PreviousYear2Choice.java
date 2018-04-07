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
import com.tools20022.repository.datatype.ISOYear;
import com.tools20022.repository.datatype.PreviousAll;
import com.tools20022.repository.entity.PortfolioTransfer;
import com.tools20022.repository.GeneratedRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between selected investment plans issued during previous years or all
 * investment plans.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PreviousYear2Choice#mmAllPreviousYears
 * PreviousYear2Choice.mmAllPreviousYears}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PreviousYear2Choice#mmSpecificPreviousYears
 * PreviousYear2Choice.mmSpecificPreviousYears}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PortfolioTransfer
 * PortfolioTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSpecificPreviousYearsGuideline#forPreviousYear2Choice
 * ConstraintSpecificPreviousYearsGuideline.forPreviousYear2Choice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PreviousYear2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between selected investment plans issued during previous years or all investment plans."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PreviousYear2Choice", propOrder = {"allPreviousYears", "specificPreviousYears"})
public class PreviousYear2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AllPrvsYrs", required = true)
	protected PreviousAll allPreviousYears;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.PreviousAll
	 * PreviousAll}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer
	 * PortfolioTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PreviousYear2Choice
	 * PreviousYear2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AllPrvsYrs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllPreviousYears"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Selection of all investment plans."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PreviousYear2Choice, PreviousAll> mmAllPreviousYears = new MMMessageAttribute<PreviousYear2Choice, PreviousAll>() {
		{
			businessComponentTrace_lazy = () -> PortfolioTransfer.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.PreviousYear2Choice.mmObject();
			isDerived = false;
			xmlTag = "AllPrvsYrs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllPreviousYears";
			definition = "Selection of all investment plans.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PreviousAll.mmObject();
		}

		@Override
		public PreviousAll getValue(PreviousYear2Choice obj) {
			return obj.getAllPreviousYears();
		}

		@Override
		public void setValue(PreviousYear2Choice obj, PreviousAll value) {
			obj.setAllPreviousYears(value);
		}
	};
	@XmlElement(name = "SpcfcPrvsYrs", required = true)
	protected List<ISOYear> specificPreviousYears;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISOYear
	 * ISOYear}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmTransferredYear
	 * PortfolioTransfer.mmTransferredYear}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PreviousYear2Choice
	 * PreviousYear2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SpcfcPrvsYrs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecificPreviousYears"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Selection of investment plans issued during previous years."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PreviousYear2Choice, List<ISOYear>> mmSpecificPreviousYears = new MMMessageAttribute<PreviousYear2Choice, List<ISOYear>>() {
		{
			businessElementTrace_lazy = () -> PortfolioTransfer.mmTransferredYear;
			componentContext_lazy = () -> com.tools20022.repository.choice.PreviousYear2Choice.mmObject();
			isDerived = false;
			xmlTag = "SpcfcPrvsYrs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecificPreviousYears";
			definition = "Selection of investment plans issued during previous years.";
			minOccurs = 1;
			simpleType_lazy = () -> ISOYear.mmObject();
		}

		@Override
		public List<ISOYear> getValue(PreviousYear2Choice obj) {
			return obj.getSpecificPreviousYears();
		}

		@Override
		public void setValue(PreviousYear2Choice obj, List<ISOYear> value) {
			obj.setSpecificPreviousYears(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PreviousYear2Choice.mmAllPreviousYears, com.tools20022.repository.choice.PreviousYear2Choice.mmSpecificPreviousYears);
				trace_lazy = () -> PortfolioTransfer.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSpecificPreviousYearsGuideline.forPreviousYear2Choice);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PreviousYear2Choice";
				definition = "Choice between selected investment plans issued during previous years or all investment plans.";
			}
		});
		return mmObject_lazy.get();
	}

	public PreviousAll getAllPreviousYears() {
		return allPreviousYears;
	}

	public PreviousYear2Choice setAllPreviousYears(PreviousAll allPreviousYears) {
		this.allPreviousYears = Objects.requireNonNull(allPreviousYears);
		return this;
	}

	public List<ISOYear> getSpecificPreviousYears() {
		return specificPreviousYears == null ? specificPreviousYears = new ArrayList<>() : specificPreviousYears;
	}

	public PreviousYear2Choice setSpecificPreviousYears(List<ISOYear> specificPreviousYears) {
		this.specificPreviousYears = Objects.requireNonNull(specificPreviousYears);
		return this;
	}
}