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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV08;
import com.tools20022.repository.entity.SafekeepingPlace;
import com.tools20022.repository.entity.SecuritiesQuantity;
import com.tools20022.repository.entity.Security;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Reporting per financial instrument.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails28#mmFinancialInstrumentIdentification
 * FinancialInstrumentDetails28.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails28#mmPriceDetails
 * FinancialInstrumentDetails28.mmPriceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails28#mmSafekeepingPlace
 * FinancialInstrumentDetails28.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails28#mmOpeningBalance
 * FinancialInstrumentDetails28.mmOpeningBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails28#mmClosingBalance
 * FinancialInstrumentDetails28.mmClosingBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails28#mmTransaction
 * FinancialInstrumentDetails28.mmTransaction}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV08#mmFinancialInstrumentDetails
 * SecuritiesTransactionPostingReportV08.mmFinancialInstrumentDetails}</li>
 * </ul>
 * </li>
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
 * "FinancialInstrumentDetails28"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Reporting per financial instrument."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FinancialInstrumentDetails28", propOrder = {"financialInstrumentIdentification", "priceDetails", "safekeepingPlace", "openingBalance", "closingBalance", "transaction"})
public class FinancialInstrumentDetails28 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "FinInstrmId", required = true)
	protected SecurityIdentification19 financialInstrumentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification19
	 * SecurityIdentification19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmIdentification
	 * Security.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails28
	 * FinancialInstrumentDetails28}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial instruments representing a sum of rights of the investor vis-a-vis the issuer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstrumentDetails28, SecurityIdentification19> mmFinancialInstrumentIdentification = new MMMessageAssociationEnd<FinancialInstrumentDetails28, SecurityIdentification19>() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentDetails28.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "Financial instruments representing a sum of rights of the investor vis-a-vis the issuer.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecurityIdentification19.mmObject();
		}

		@Override
		public SecurityIdentification19 getValue(FinancialInstrumentDetails28 obj) {
			return obj.getFinancialInstrumentIdentification();
		}

		@Override
		public void setValue(FinancialInstrumentDetails28 obj, SecurityIdentification19 value) {
			obj.setFinancialInstrumentIdentification(value);
		}
	};
	@XmlElement(name = "PricDtls")
	protected PriceInformation18 priceDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PriceInformation18
	 * PriceInformation18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmPricing
	 * Security.mmPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails28
	 * FinancialInstrumentDetails28}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PricDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information regarding the price of the instrument."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstrumentDetails28, Optional<PriceInformation18>> mmPriceDetails = new MMMessageAssociationEnd<FinancialInstrumentDetails28, Optional<PriceInformation18>>() {
		{
			businessElementTrace_lazy = () -> Security.mmPricing;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentDetails28.mmObject();
			isDerived = false;
			xmlTag = "PricDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceDetails";
			definition = "Information regarding the price of the instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PriceInformation18.mmObject();
		}

		@Override
		public Optional<PriceInformation18> getValue(FinancialInstrumentDetails28 obj) {
			return obj.getPriceDetails();
		}

		@Override
		public void setValue(FinancialInstrumentDetails28 obj, Optional<PriceInformation18> value) {
			obj.setPriceDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "SfkpgPlc")
	protected SafeKeepingPlace1 safekeepingPlace;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SafeKeepingPlace1
	 * SafeKeepingPlace1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace
	 * SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails28
	 * FinancialInstrumentDetails28}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SfkpgPlc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlace"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Place where the securities are safe-kept, physically or notionally. This place can be, for example, a local custodian, a Central Securities Depository (CSD) or an International Central Securities Depository (ICSD)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstrumentDetails28, Optional<SafeKeepingPlace1>> mmSafekeepingPlace = new MMMessageAssociationEnd<FinancialInstrumentDetails28, Optional<SafeKeepingPlace1>>() {
		{
			businessComponentTrace_lazy = () -> SafekeepingPlace.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentDetails28.mmObject();
			isDerived = false;
			xmlTag = "SfkpgPlc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlace";
			definition = "Place where the securities are safe-kept, physically or notionally. This place can be, for example, a local custodian, a Central Securities Depository (CSD) or an International Central Securities Depository (ICSD).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SafeKeepingPlace1.mmObject();
		}

		@Override
		public Optional<SafeKeepingPlace1> getValue(FinancialInstrumentDetails28 obj) {
			return obj.getSafekeepingPlace();
		}

		@Override
		public void setValue(FinancialInstrumentDetails28 obj, Optional<SafeKeepingPlace1> value) {
			obj.setSafekeepingPlace(value.orElse(null));
		}
	};
	@XmlElement(name = "OpngBal")
	protected OpeningBalance3 openingBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OpeningBalance3
	 * OpeningBalance3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmAggregateQuantityBalance
	 * SecuritiesQuantity.mmAggregateQuantityBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails28
	 * FinancialInstrumentDetails28}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OpngBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpeningBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Opening balance for the statement period (first opening balance) or of this page (intermediary opening balance)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstrumentDetails28, Optional<OpeningBalance3>> mmOpeningBalance = new MMMessageAssociationEnd<FinancialInstrumentDetails28, Optional<OpeningBalance3>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesQuantity.mmAggregateQuantityBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentDetails28.mmObject();
			isDerived = false;
			xmlTag = "OpngBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpeningBalance";
			definition = "Opening balance for the statement period (first opening balance) or of this page (intermediary opening balance).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OpeningBalance3.mmObject();
		}

		@Override
		public Optional<OpeningBalance3> getValue(FinancialInstrumentDetails28 obj) {
			return obj.getOpeningBalance();
		}

		@Override
		public void setValue(FinancialInstrumentDetails28 obj, Optional<OpeningBalance3> value) {
			obj.setOpeningBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "ClsgBal")
	protected ClosingBalance3 closingBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ClosingBalance3
	 * ClosingBalance3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmAggregateQuantityBalance
	 * SecuritiesQuantity.mmAggregateQuantityBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails28
	 * FinancialInstrumentDetails28}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClsgBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosingBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Closing balance for the statement period (final closing balance) or of this page (intermediary closing balance)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstrumentDetails28, Optional<ClosingBalance3>> mmClosingBalance = new MMMessageAssociationEnd<FinancialInstrumentDetails28, Optional<ClosingBalance3>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesQuantity.mmAggregateQuantityBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentDetails28.mmObject();
			isDerived = false;
			xmlTag = "ClsgBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingBalance";
			definition = "Closing balance for the statement period (final closing balance) or of this page (intermediary closing balance).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ClosingBalance3.mmObject();
		}

		@Override
		public Optional<ClosingBalance3> getValue(FinancialInstrumentDetails28 obj) {
			return obj.getClosingBalance();
		}

		@Override
		public void setValue(FinancialInstrumentDetails28 obj, Optional<ClosingBalance3> value) {
			obj.setClosingBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "Tx", required = true)
	protected List<Transaction62> transaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Transaction62
	 * Transaction62}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmTrade
	 * SecuritiesQuantity.mmTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails28
	 * FinancialInstrumentDetails28}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Transaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction details."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstrumentDetails28, List<Transaction62>> mmTransaction = new MMMessageAssociationEnd<FinancialInstrumentDetails28, List<Transaction62>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesQuantity.mmTrade;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentDetails28.mmObject();
			isDerived = false;
			xmlTag = "Tx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transaction";
			definition = "Transaction details.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Transaction62.mmObject();
		}

		@Override
		public List<Transaction62> getValue(FinancialInstrumentDetails28 obj) {
			return obj.getTransaction();
		}

		@Override
		public void setValue(FinancialInstrumentDetails28 obj, List<Transaction62> value) {
			obj.setTransaction(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentDetails28.mmFinancialInstrumentIdentification, com.tools20022.repository.msg.FinancialInstrumentDetails28.mmPriceDetails,
						com.tools20022.repository.msg.FinancialInstrumentDetails28.mmSafekeepingPlace, com.tools20022.repository.msg.FinancialInstrumentDetails28.mmOpeningBalance,
						com.tools20022.repository.msg.FinancialInstrumentDetails28.mmClosingBalance, com.tools20022.repository.msg.FinancialInstrumentDetails28.mmTransaction);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesTransactionPostingReportV08.mmFinancialInstrumentDetails);
				trace_lazy = () -> Security.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancialInstrumentDetails28";
				definition = "Reporting per financial instrument.";
			}
		});
		return mmObject_lazy.get();
	}

	public SecurityIdentification19 getFinancialInstrumentIdentification() {
		return financialInstrumentIdentification;
	}

	public FinancialInstrumentDetails28 setFinancialInstrumentIdentification(SecurityIdentification19 financialInstrumentIdentification) {
		this.financialInstrumentIdentification = Objects.requireNonNull(financialInstrumentIdentification);
		return this;
	}

	public Optional<PriceInformation18> getPriceDetails() {
		return priceDetails == null ? Optional.empty() : Optional.of(priceDetails);
	}

	public FinancialInstrumentDetails28 setPriceDetails(PriceInformation18 priceDetails) {
		this.priceDetails = priceDetails;
		return this;
	}

	public Optional<SafeKeepingPlace1> getSafekeepingPlace() {
		return safekeepingPlace == null ? Optional.empty() : Optional.of(safekeepingPlace);
	}

	public FinancialInstrumentDetails28 setSafekeepingPlace(SafeKeepingPlace1 safekeepingPlace) {
		this.safekeepingPlace = safekeepingPlace;
		return this;
	}

	public Optional<OpeningBalance3> getOpeningBalance() {
		return openingBalance == null ? Optional.empty() : Optional.of(openingBalance);
	}

	public FinancialInstrumentDetails28 setOpeningBalance(OpeningBalance3 openingBalance) {
		this.openingBalance = openingBalance;
		return this;
	}

	public Optional<ClosingBalance3> getClosingBalance() {
		return closingBalance == null ? Optional.empty() : Optional.of(closingBalance);
	}

	public FinancialInstrumentDetails28 setClosingBalance(ClosingBalance3 closingBalance) {
		this.closingBalance = closingBalance;
		return this;
	}

	public List<Transaction62> getTransaction() {
		return transaction == null ? transaction = new ArrayList<>() : transaction;
	}

	public FinancialInstrumentDetails28 setTransaction(List<Transaction62> transaction) {
		this.transaction = Objects.requireNonNull(transaction);
		return this;
	}
}