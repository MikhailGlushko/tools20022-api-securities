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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.LegIdentification1Choice;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Fee3;
import com.tools20022.repository.msg.FinancialInstrument57;
import com.tools20022.repository.msg.InvestmentAccount58;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information about a switch leg that is rejected or repaired.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchLegReferences2#mmLegIdentification
 * SwitchLegReferences2.mmLegIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchLegReferences2#mmLegRejectionReason
 * SwitchLegReferences2.mmLegRejectionReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchLegReferences2#mmRepairedFee
 * SwitchLegReferences2.mmRepairedFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchLegReferences2#mmInvestmentAccountDetails
 * SwitchLegReferences2.mmInvestmentAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchLegReferences2#mmFinancialInstrumentDetails
 * SwitchLegReferences2.mmFinancialInstrumentDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
 * InvestmentFundOrder}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SwitchLegReferences2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information about a switch leg that is rejected or repaired."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SwitchLegReferences2", propOrder = {"legIdentification", "legRejectionReason", "repairedFee", "investmentAccountDetails", "financialInstrumentDetails"})
public class SwitchLegReferences2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "LegId", required = true)
	protected LegIdentification1Choice legIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.LegIdentification1Choice
	 * LegIdentification1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmIdentification
	 * SecuritiesOrder.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchLegReferences2
	 * SwitchLegReferences2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LegId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of a switch leg."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SwitchLegReferences2, LegIdentification1Choice> mmLegIdentification = new MMMessageAssociationEnd<SwitchLegReferences2, LegIdentification1Choice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SwitchLegReferences2.mmObject();
			isDerived = false;
			xmlTag = "LegId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegIdentification";
			definition = "Identification of a switch leg.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> LegIdentification1Choice.mmObject();
		}

		@Override
		public LegIdentification1Choice getValue(SwitchLegReferences2 obj) {
			return obj.getLegIdentification();
		}

		@Override
		public void setValue(SwitchLegReferences2 obj, LegIdentification1Choice value) {
			obj.setLegIdentification(value);
		}
	};
	@XmlElement(name = "LegRjctnRsn")
	protected Max350Text legRejectionReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmRejectionReason
	 * StatusReason.mmRejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchLegReferences2
	 * SwitchLegReferences2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LegRjctnRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegRejectionReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information about the reason for the rejection of the leg."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SwitchLegReferences2, Optional<Max350Text>> mmLegRejectionReason = new MMMessageAttribute<SwitchLegReferences2, Optional<Max350Text>>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmRejectionReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.SwitchLegReferences2.mmObject();
			isDerived = false;
			xmlTag = "LegRjctnRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegRejectionReason";
			definition = "Additional information about the reason for the rejection of the leg.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(SwitchLegReferences2 obj) {
			return obj.getLegRejectionReason();
		}

		@Override
		public void setValue(SwitchLegReferences2 obj, Optional<Max350Text> value) {
			obj.setLegRejectionReason(value.orElse(null));
		}
	};
	@XmlElement(name = "RprdFee")
	protected List<Fee3> repairedFee;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Fee3 Fee3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Charges Charges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchLegReferences2
	 * SwitchLegReferences2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RprdFee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepairedFee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Elements from the original individual order that have been repaired so that the order can be accepted."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SwitchLegReferences2, List<Fee3>> mmRepairedFee = new MMMessageAssociationEnd<SwitchLegReferences2, List<Fee3>>() {
		{
			businessComponentTrace_lazy = () -> Charges.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SwitchLegReferences2.mmObject();
			isDerived = false;
			xmlTag = "RprdFee";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepairedFee";
			definition = "Elements from the original individual order that have been repaired so that the order can be accepted.";
			maxOccurs = 10;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Fee3.mmObject();
		}

		@Override
		public List<Fee3> getValue(SwitchLegReferences2 obj) {
			return obj.getRepairedFee();
		}

		@Override
		public void setValue(SwitchLegReferences2 obj, List<Fee3> value) {
			obj.setRepairedFee(value);
		}
	};
	@XmlElement(name = "InvstmtAcctDtls")
	protected InvestmentAccount58 investmentAccountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.InvestmentAccount58
	 * InvestmentAccount58}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmInvestmentAccount
	 * InvestmentFundTransaction.mmInvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchLegReferences2
	 * SwitchLegReferences2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstmtAcctDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account identification of the switch leg that is rejected or repaired."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SwitchLegReferences2, Optional<InvestmentAccount58>> mmInvestmentAccountDetails = new MMMessageAssociationEnd<SwitchLegReferences2, Optional<InvestmentAccount58>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmInvestmentAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SwitchLegReferences2.mmObject();
			isDerived = false;
			xmlTag = "InvstmtAcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentAccountDetails";
			definition = "Account identification of the switch leg that is rejected or repaired.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InvestmentAccount58.mmObject();
		}

		@Override
		public Optional<InvestmentAccount58> getValue(SwitchLegReferences2 obj) {
			return obj.getInvestmentAccountDetails();
		}

		@Override
		public void setValue(SwitchLegReferences2 obj, Optional<InvestmentAccount58> value) {
			obj.setInvestmentAccountDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "FinInstrmDtls")
	protected FinancialInstrument57 financialInstrumentDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FinancialInstrument57
	 * FinancialInstrument57}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmInvestmentFundClass
	 * InvestmentFundTransaction.mmInvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchLegReferences2
	 * SwitchLegReferences2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial instrument identification of the switch leg that is rejected or repaired."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SwitchLegReferences2, Optional<FinancialInstrument57>> mmFinancialInstrumentDetails = new MMMessageAssociationEnd<SwitchLegReferences2, Optional<FinancialInstrument57>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmInvestmentFundClass;
			componentContext_lazy = () -> com.tools20022.repository.msg.SwitchLegReferences2.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentDetails";
			definition = "Financial instrument identification of the switch leg that is rejected or repaired.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrument57.mmObject();
		}

		@Override
		public Optional<FinancialInstrument57> getValue(SwitchLegReferences2 obj) {
			return obj.getFinancialInstrumentDetails();
		}

		@Override
		public void setValue(SwitchLegReferences2 obj, Optional<FinancialInstrument57> value) {
			obj.setFinancialInstrumentDetails(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SwitchLegReferences2.mmLegIdentification, com.tools20022.repository.msg.SwitchLegReferences2.mmLegRejectionReason,
						com.tools20022.repository.msg.SwitchLegReferences2.mmRepairedFee, com.tools20022.repository.msg.SwitchLegReferences2.mmInvestmentAccountDetails,
						com.tools20022.repository.msg.SwitchLegReferences2.mmFinancialInstrumentDetails);
				trace_lazy = () -> InvestmentFundOrder.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SwitchLegReferences2";
				definition = "Information about a switch leg that is rejected or repaired.";
			}
		});
		return mmObject_lazy.get();
	}

	public LegIdentification1Choice getLegIdentification() {
		return legIdentification;
	}

	public SwitchLegReferences2 setLegIdentification(LegIdentification1Choice legIdentification) {
		this.legIdentification = Objects.requireNonNull(legIdentification);
		return this;
	}

	public Optional<Max350Text> getLegRejectionReason() {
		return legRejectionReason == null ? Optional.empty() : Optional.of(legRejectionReason);
	}

	public SwitchLegReferences2 setLegRejectionReason(Max350Text legRejectionReason) {
		this.legRejectionReason = legRejectionReason;
		return this;
	}

	public List<Fee3> getRepairedFee() {
		return repairedFee == null ? repairedFee = new ArrayList<>() : repairedFee;
	}

	public SwitchLegReferences2 setRepairedFee(List<Fee3> repairedFee) {
		this.repairedFee = Objects.requireNonNull(repairedFee);
		return this;
	}

	public Optional<InvestmentAccount58> getInvestmentAccountDetails() {
		return investmentAccountDetails == null ? Optional.empty() : Optional.of(investmentAccountDetails);
	}

	public SwitchLegReferences2 setInvestmentAccountDetails(InvestmentAccount58 investmentAccountDetails) {
		this.investmentAccountDetails = investmentAccountDetails;
		return this;
	}

	public Optional<FinancialInstrument57> getFinancialInstrumentDetails() {
		return financialInstrumentDetails == null ? Optional.empty() : Optional.of(financialInstrumentDetails);
	}

	public SwitchLegReferences2 setFinancialInstrumentDetails(FinancialInstrument57 financialInstrumentDetails) {
		this.financialInstrumentDetails = financialInstrumentDetails;
		return this;
	}
}