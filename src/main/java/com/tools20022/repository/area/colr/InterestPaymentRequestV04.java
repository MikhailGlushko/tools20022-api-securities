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

package com.tools20022.repository.area.colr;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.CollateralManagementLatestVersion;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The InterestPaymentRequest message is sent by either;<br>
 * - the collateral taker or its collateral manager to the collateral giver or
 * its collateral manager, or<br>
 * - the collateral giver or its collateral manager to the collateral taker or
 * its collateral manager<br>
 * It is used to request payment or advise the amount due for interest
 * calculated for a specified period. The interest is based on the amount of
 * collateral that has been held during the calculation period. It is possible
 * to send these messages on a bi-lateral basis for matching.<br>
 * <br>
 * The message definition is intended for use with the ISO20022 Business
 * Application Header.<br>
 * <br>
 * <b>Usage</b><br>
 * The InterestPaymentRequest message is used to advise the interest amount
 * calculated for a specific period or request payment for an interest amount
 * for a specific period.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.InterestPaymentRequestV04#mmTransactionIdentification
 * InterestPaymentRequestV04.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.InterestPaymentRequestV04#mmObligation
 * InterestPaymentRequestV04.mmObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.InterestPaymentRequestV04#mmAgreement
 * InterestPaymentRequestV04.mmAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.InterestPaymentRequestV04#mmInterestDueToA
 * InterestPaymentRequestV04.mmInterestDueToA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.InterestPaymentRequestV04#mmInterestDueToB
 * InterestPaymentRequestV04.mmInterestDueToB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.InterestPaymentRequestV04#mmNetAmountDetails
 * InterestPaymentRequestV04.mmNetAmountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.InterestPaymentRequestV04#mmSupplementaryData
 * InterestPaymentRequestV04.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "IntrstPmtReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CollateralManagementLatestVersion
 * CollateralManagementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code colr.013.001.04}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InterestPaymentRequestV04"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe InterestPaymentRequest message is sent by either;\r\n- the collateral taker or its collateral manager to the collateral giver or its collateral manager, or\r\n- the collateral giver or its collateral manager to the collateral taker or its collateral manager\r\nIt is used to request payment or advise the amount due for interest calculated for a specified period. The interest is based on the amount of collateral that has been held during the calculation period. It is possible to send these messages on a bi-lateral basis for matching.\r\n\r\nThe message definition is intended for use with the ISO20022 Business Application Header.\r\n\r\nUsage\r\nThe InterestPaymentRequest message is used to advise the interest amount calculated for a specific period or request payment for an interest amount for a specific period."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InterestPaymentRequestV04", propOrder = {"transactionIdentification", "obligation", "agreement", "interestDueToA", "interestDueToB", "netAmountDetails", "supplementaryData"})
public class InterestPaymentRequestV04 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TxId", required = true)
	protected Max35Text transactionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the transaction as know by the instructing party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<InterestPaymentRequestV04, Max35Text> mmTransactionIdentification = new MMMessageBuildingBlock<InterestPaymentRequestV04, Max35Text>() {
		{
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Unambiguous identification of the transaction as know by the instructing party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(InterestPaymentRequestV04 obj) {
			return obj.getTransactionIdentification();
		}

		@Override
		public void setValue(InterestPaymentRequestV04 obj, Max35Text value) {
			obj.setTransactionIdentification(value);
		}
	};
	@XmlElement(name = "Oblgtn", required = true)
	protected Obligation4 obligation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Obligation4
	 * Obligation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Oblgtn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Obligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information like the identification of the party or parties associated with the collateral agreement, the exposure type and the valuation date."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<InterestPaymentRequestV04, Obligation4> mmObligation = new MMMessageBuildingBlock<InterestPaymentRequestV04, Obligation4>() {
		{
			xmlTag = "Oblgtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Obligation";
			definition = "Provides information like the identification of the party or parties associated with the collateral agreement, the exposure type and the valuation date.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Obligation4.mmObject();
		}

		@Override
		public Obligation4 getValue(InterestPaymentRequestV04 obj) {
			return obj.getObligation();
		}

		@Override
		public void setValue(InterestPaymentRequestV04 obj, Obligation4 value) {
			obj.setObligation(value);
		}
	};
	@XmlElement(name = "Agrmt", required = true)
	protected Agreement4 agreement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Agreement4
	 * Agreement4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Agrmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Agreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Agreement details for the over the counter market."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<InterestPaymentRequestV04, Agreement4> mmAgreement = new MMMessageBuildingBlock<InterestPaymentRequestV04, Agreement4>() {
		{
			xmlTag = "Agrmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Agreement";
			definition = "Agreement details for the over the counter market.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Agreement4.mmObject();
		}

		@Override
		public Agreement4 getValue(InterestPaymentRequestV04 obj) {
			return obj.getAgreement();
		}

		@Override
		public void setValue(InterestPaymentRequestV04 obj, Agreement4 value) {
			obj.setAgreement(value);
		}
	};
	@XmlElement(name = "IntrstDueToA")
	protected InterestAmount1 interestDueToA;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.InterestAmount1
	 * InterestAmount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstDueToA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestDueToA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details on the interest amount due to party A."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<InterestPaymentRequestV04, Optional<InterestAmount1>> mmInterestDueToA = new MMMessageBuildingBlock<InterestPaymentRequestV04, Optional<InterestAmount1>>() {
		{
			xmlTag = "IntrstDueToA";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestDueToA";
			definition = "Provides details on the interest amount due to party A.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> InterestAmount1.mmObject();
		}

		@Override
		public Optional<InterestAmount1> getValue(InterestPaymentRequestV04 obj) {
			return obj.getInterestDueToA();
		}

		@Override
		public void setValue(InterestPaymentRequestV04 obj, Optional<InterestAmount1> value) {
			obj.setInterestDueToA(value.orElse(null));
		}
	};
	@XmlElement(name = "IntrstDueToB")
	protected InterestAmount1 interestDueToB;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.InterestAmount1
	 * InterestAmount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstDueToB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestDueToB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details on the interest amount due to party B."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<InterestPaymentRequestV04, Optional<InterestAmount1>> mmInterestDueToB = new MMMessageBuildingBlock<InterestPaymentRequestV04, Optional<InterestAmount1>>() {
		{
			xmlTag = "IntrstDueToB";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestDueToB";
			definition = "Provides details on the interest amount due to party B.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> InterestAmount1.mmObject();
		}

		@Override
		public Optional<InterestAmount1> getValue(InterestPaymentRequestV04 obj) {
			return obj.getInterestDueToB();
		}

		@Override
		public void setValue(InterestPaymentRequestV04 obj, Optional<InterestAmount1> value) {
			obj.setInterestDueToB(value.orElse(null));
		}
	};
	@XmlElement(name = "NetAmtDtls")
	protected InterestResult1 netAmountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.InterestResult1
	 * InterestResult1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetAmtDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetAmountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the net interest amount due to A or due to B in case of collateral held and posted during a period."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<InterestPaymentRequestV04, Optional<InterestResult1>> mmNetAmountDetails = new MMMessageBuildingBlock<InterestPaymentRequestV04, Optional<InterestResult1>>() {
		{
			xmlTag = "NetAmtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetAmountDetails";
			definition = "Provides the net interest amount due to A or due to B in case of collateral held and posted during a period.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> InterestResult1.mmObject();
		}

		@Override
		public Optional<InterestResult1> getValue(InterestPaymentRequestV04 obj) {
			return obj.getNetAmountDetails();
		}

		@Override
		public void setValue(InterestPaymentRequestV04 obj, Optional<InterestResult1> value) {
			obj.setNetAmountDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<InterestPaymentRequestV04, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<InterestPaymentRequestV04, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(InterestPaymentRequestV04 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(InterestPaymentRequestV04 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InterestPaymentRequestV04";
				definition = "Scope\r\nThe InterestPaymentRequest message is sent by either;\r\n- the collateral taker or its collateral manager to the collateral giver or its collateral manager, or\r\n- the collateral giver or its collateral manager to the collateral taker or its collateral manager\r\nIt is used to request payment or advise the amount due for interest calculated for a specified period. The interest is based on the amount of collateral that has been held during the calculation period. It is possible to send these messages on a bi-lateral basis for matching.\r\n\r\nThe message definition is intended for use with the ISO20022 Business Application Header.\r\n\r\nUsage\r\nThe InterestPaymentRequest message is used to advise the interest amount calculated for a specific period or request payment for an interest amount for a specific period.";
				rootElement = "Document";
				xmlTag = "IntrstPmtReq";
				businessArea_lazy = () -> CollateralManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.colr.InterestPaymentRequestV04.mmTransactionIdentification, com.tools20022.repository.area.colr.InterestPaymentRequestV04.mmObligation,
						com.tools20022.repository.area.colr.InterestPaymentRequestV04.mmAgreement, com.tools20022.repository.area.colr.InterestPaymentRequestV04.mmInterestDueToA,
						com.tools20022.repository.area.colr.InterestPaymentRequestV04.mmInterestDueToB, com.tools20022.repository.area.colr.InterestPaymentRequestV04.mmNetAmountDetails,
						com.tools20022.repository.area.colr.InterestPaymentRequestV04.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "colr";
						messageFunctionality = "013";
						version = "04";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return InterestPaymentRequestV04.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getTransactionIdentification() {
		return transactionIdentification;
	}

	public InterestPaymentRequestV04 setTransactionIdentification(Max35Text transactionIdentification) {
		this.transactionIdentification = Objects.requireNonNull(transactionIdentification);
		return this;
	}

	public Obligation4 getObligation() {
		return obligation;
	}

	public InterestPaymentRequestV04 setObligation(Obligation4 obligation) {
		this.obligation = Objects.requireNonNull(obligation);
		return this;
	}

	public Agreement4 getAgreement() {
		return agreement;
	}

	public InterestPaymentRequestV04 setAgreement(Agreement4 agreement) {
		this.agreement = Objects.requireNonNull(agreement);
		return this;
	}

	public Optional<InterestAmount1> getInterestDueToA() {
		return interestDueToA == null ? Optional.empty() : Optional.of(interestDueToA);
	}

	public InterestPaymentRequestV04 setInterestDueToA(InterestAmount1 interestDueToA) {
		this.interestDueToA = interestDueToA;
		return this;
	}

	public Optional<InterestAmount1> getInterestDueToB() {
		return interestDueToB == null ? Optional.empty() : Optional.of(interestDueToB);
	}

	public InterestPaymentRequestV04 setInterestDueToB(InterestAmount1 interestDueToB) {
		this.interestDueToB = interestDueToB;
		return this;
	}

	public Optional<InterestResult1> getNetAmountDetails() {
		return netAmountDetails == null ? Optional.empty() : Optional.of(netAmountDetails);
	}

	public InterestPaymentRequestV04 setNetAmountDetails(InterestResult1 netAmountDetails) {
		this.netAmountDetails = netAmountDetails;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public InterestPaymentRequestV04 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:colr.013.001.04")
	static public class Document {
		@XmlElement(name = "IntrstPmtReq", required = true)
		public InterestPaymentRequestV04 messageBody;
	}
}