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
import com.tools20022.repository.choice.ExpectedCollateral2Choice;
import com.tools20022.repository.choice.MarginRequirement1Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The MarginCallRequest message is sent by the collateral taker or its
 * collateral manager to the collateral giver or its collateral manager<br>
 * This message is used to request new collateral at the initiation of an
 * exposure or request additional collateral for an existing exposure. It can
 * also be used to recall collateral upon the collateral giver or its collateral
 * manager's request.<br>
 * <br>
 * The message definition is intended for use with the ISO20022 Business
 * Application Header.<br>
 * <br>
 * <b>Usage</b><br>
 * When sent by the collateral taker the MarginCallRequest message is used to:<br>
 * - request new collateral at the initiation of an exposure<br>
 * - request additional collateral<br>
 * When sent by the collateral giver the MarginCallRequest message is used to:<br>
 * - request the return of collateral
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV04#mmTransactionIdentification
 * MarginCallRequestV04.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV04#mmObligation
 * MarginCallRequestV04.mmObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV04#mmAgreement
 * MarginCallRequestV04.mmAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV04#mmMarginCallResult
 * MarginCallRequestV04.mmMarginCallResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV04#mmMarginDetailsDueToA
 * MarginCallRequestV04.mmMarginDetailsDueToA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV04#mmMarginDetailsDueToB
 * MarginCallRequestV04.mmMarginDetailsDueToB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV04#mmRequirementDetailsDueToA
 * MarginCallRequestV04.mmRequirementDetailsDueToA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV04#mmRequirementDetailsDueToB
 * MarginCallRequestV04.mmRequirementDetailsDueToB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV04#mmExpectedCollateralDueToA
 * MarginCallRequestV04.mmExpectedCollateralDueToA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV04#mmExpectedCollateralDueToB
 * MarginCallRequestV04.mmExpectedCollateralDueToB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV04#mmMarginCallDetails
 * MarginCallRequestV04.mmMarginCallDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV04#mmSupplementaryData
 * MarginCallRequestV04.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "MrgnCallReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CollateralManagementLatestVersion
 * CollateralManagementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code colr.003.001.04}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MarginCallRequestV04"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe MarginCallRequest message is sent by the collateral taker or its collateral manager to the collateral giver or its collateral manager\r\nThis message is used to request new collateral at the initiation of an exposure or request additional collateral for an existing exposure. It can also be used to recall collateral upon the collateral giver or its collateral manager's request.\r\n\r\nThe message definition is intended for use with the ISO20022 Business Application Header.\r\n\r\nUsage\r\nWhen sent by the collateral taker the MarginCallRequest message is used to:\r\n- request new collateral at the initiation of an exposure\r\n- request additional collateral\r\nWhen sent by the collateral giver the MarginCallRequest message is used to:\r\n- request the return of collateral"
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "MarginCallRequestV04", propOrder = {"transactionIdentification", "obligation", "agreement", "marginCallResult", "marginDetailsDueToA", "marginDetailsDueToB", "requirementDetailsDueToA", "requirementDetailsDueToB",
		"expectedCollateralDueToA", "expectedCollateralDueToB", "marginCallDetails", "supplementaryData"})
public class MarginCallRequestV04 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected Max35Text transactionIdentification;
	/**
	 * Unambiguous identification of the transaction as know by the instructing
	 * party.
	 * <p>
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
	public static final MMMessageBuildingBlock mmTransactionIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Unambiguous identification of the transaction as know by the instructing party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MarginCallRequestV04.class.getMethod("getTransactionIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Obligation4 obligation;
	/**
	 * Provides information like the identification of the party or parties
	 * associated with the collateral agreement, the exposure type and the
	 * valuation date.
	 * <p>
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
	public static final MMMessageBuildingBlock mmObligation = new MMMessageBuildingBlock() {
		{
			xmlTag = "Oblgtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Obligation";
			definition = "Provides information like the identification of the party or parties associated with the collateral agreement, the exposure type and the valuation date.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Obligation4.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MarginCallRequestV04.class.getMethod("getObligation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Agreement4 agreement;
	/**
	 * Agreement details for the over the counter market.
	 * <p>
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
	public static final MMMessageBuildingBlock mmAgreement = new MMMessageBuildingBlock() {
		{
			xmlTag = "Agrmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Agreement";
			definition = "Agreement details for the over the counter market.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Agreement4.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MarginCallRequestV04.class.getMethod("getAgreement", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected MarginCallResult3 marginCallResult;
	/**
	 * Summation of the call amounts per margin type. It is provided for the
	 * purposes of carrying forward for future messages that are used to compare
	 * the margin call results to determine whether a call is agreed or
	 * full/partially disputed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MarginCallResult3
	 * MarginCallResult3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MrgnCallRslt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginCallResult"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Summation of the call amounts per margin type. It is provided for the purposes of carrying forward for future messages that are used to compare the margin call results to determine whether a call is agreed or full/partially disputed."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMarginCallResult = new MMMessageBuildingBlock() {
		{
			xmlTag = "MrgnCallRslt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginCallResult";
			definition = "Summation of the call amounts per margin type. It is provided for the purposes of carrying forward for future messages that are used to compare the margin call results to determine whether a call is agreed or full/partially disputed.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MarginCallResult3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MarginCallRequestV04.class.getMethod("getMarginCallResult", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected MarginCall1 marginDetailsDueToA;
	/**
	 * Provides details about the margin calculation that would be due to party
	 * A.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.MarginCall1
	 * MarginCall1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MrgnDtlsDueToA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginDetailsDueToA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the margin calculation that would be due to party A."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMarginDetailsDueToA = new MMMessageBuildingBlock() {
		{
			xmlTag = "MrgnDtlsDueToA";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginDetailsDueToA";
			definition = "Provides details about the margin calculation that would be due to party A.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MarginCall1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MarginCallRequestV04.class.getMethod("getMarginDetailsDueToA", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected MarginCall1 marginDetailsDueToB;
	/**
	 * Provides details about the margin calculation that would be due to party
	 * B.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.MarginCall1
	 * MarginCall1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MrgnDtlsDueToB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginDetailsDueToB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the margin calculation that would be due to party B."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMarginDetailsDueToB = new MMMessageBuildingBlock() {
		{
			xmlTag = "MrgnDtlsDueToB";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginDetailsDueToB";
			definition = "Provides details about the margin calculation that would be due to party B.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MarginCall1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MarginCallRequestV04.class.getMethod("getMarginDetailsDueToB", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected MarginRequirement1Choice requirementDetailsDueToA;
	/**
	 * Amount of expected margin that will be either delivered to party A by
	 * party B or recalled to party A from party B.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.MarginRequirement1Choice
	 * MarginRequirement1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RqrmntDtlsDueToA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequirementDetailsDueToA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of expected margin that will be either delivered to party A by party B or recalled to party A from party B."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmRequirementDetailsDueToA = new MMMessageBuildingBlock() {
		{
			xmlTag = "RqrmntDtlsDueToA";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequirementDetailsDueToA";
			definition = "Amount of expected margin that will be either delivered to party A by party B or recalled to party A from party B.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MarginRequirement1Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MarginCallRequestV04.class.getMethod("getRequirementDetailsDueToA", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected MarginRequirement1Choice requirementDetailsDueToB;
	/**
	 * Amount of expected margin that will be either delivered to party B by
	 * party A or recalled to party B from party A.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.MarginRequirement1Choice
	 * MarginRequirement1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RqrmntDtlsDueToB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequirementDetailsDueToB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of expected margin that will be either delivered to party B by party A or recalled to party B from party A."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmRequirementDetailsDueToB = new MMMessageBuildingBlock() {
		{
			xmlTag = "RqrmntDtlsDueToB";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequirementDetailsDueToB";
			definition = "Amount of expected margin that will be either delivered to party B by party A or recalled to party B from party A.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MarginRequirement1Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MarginCallRequestV04.class.getMethod("getRequirementDetailsDueToB", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ExpectedCollateral2Choice expectedCollateralDueToA;
	/**
	 * Provides details about the type of collateral that will be either
	 * delivered to party A by party B or recalled to party A from party B.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ExpectedCollateral2Choice
	 * ExpectedCollateral2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpctdCollDueToA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpectedCollateralDueToA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the type of collateral that will be either delivered to party A by party B or recalled to party A from party B."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmExpectedCollateralDueToA = new MMMessageBuildingBlock() {
		{
			xmlTag = "XpctdCollDueToA";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpectedCollateralDueToA";
			definition = "Provides details about the type of collateral that will be either delivered to party A by party B or recalled to party A from party B.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ExpectedCollateral2Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MarginCallRequestV04.class.getMethod("getExpectedCollateralDueToA", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ExpectedCollateral2Choice expectedCollateralDueToB;
	/**
	 * Provides details about the type of collateral that will be either
	 * delivered to party B by party A or recalled to party B from party A.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ExpectedCollateral2Choice
	 * ExpectedCollateral2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpctdCollDueToB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpectedCollateralDueToB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the type of collateral that will be either delivered to party B by party A or recalled to party B from party A."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmExpectedCollateralDueToB = new MMMessageBuildingBlock() {
		{
			xmlTag = "XpctdCollDueToB";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpectedCollateralDueToB";
			definition = "Provides details about the type of collateral that will be either delivered to party B by party A or recalled to party B from party A.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ExpectedCollateral2Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MarginCallRequestV04.class.getMethod("getExpectedCollateralDueToB", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<MarginCall2> marginCallDetails;
	/**
	 * Allows the reporting of the margin requirements for multiple accounts and
	 * report a single margin call amount made up of the aggregate of all the
	 * individual requirement amounts.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.MarginCall2
	 * MarginCall2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MrgnCallDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginCallDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Allows the reporting of the margin requirements for multiple accounts and report a single margin call amount made up of the aggregate of all the individual requirement amounts."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMarginCallDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "MrgnCallDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginCallDetails";
			definition = "Allows the reporting of the margin requirements for multiple accounts and report a single margin call amount made up of the aggregate of all the individual requirement amounts.";
			minOccurs = 0;
			complexType_lazy = () -> MarginCall2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MarginCallRequestV04.class.getMethod("getMarginCallDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * Additional information that can not be captured in the structured fields
	 * and/or any other specific block.
	 * <p>
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
	 * "Additional information that can not be captured in the structured fields and/or any other specific block. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block. ";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MarginCallRequestV04.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MarginCallRequestV04";
				definition = "Scope\r\nThe MarginCallRequest message is sent by the collateral taker or its collateral manager to the collateral giver or its collateral manager\r\nThis message is used to request new collateral at the initiation of an exposure or request additional collateral for an existing exposure. It can also be used to recall collateral upon the collateral giver or its collateral manager's request.\r\n\r\nThe message definition is intended for use with the ISO20022 Business Application Header.\r\n\r\nUsage\r\nWhen sent by the collateral taker the MarginCallRequest message is used to:\r\n- request new collateral at the initiation of an exposure\r\n- request additional collateral\r\nWhen sent by the collateral giver the MarginCallRequest message is used to:\r\n- request the return of collateral";
				rootElement = "Document";
				xmlTag = "MrgnCallReq";
				businessArea_lazy = () -> CollateralManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.colr.MarginCallRequestV04.mmTransactionIdentification, com.tools20022.repository.area.colr.MarginCallRequestV04.mmObligation,
						com.tools20022.repository.area.colr.MarginCallRequestV04.mmAgreement, com.tools20022.repository.area.colr.MarginCallRequestV04.mmMarginCallResult,
						com.tools20022.repository.area.colr.MarginCallRequestV04.mmMarginDetailsDueToA, com.tools20022.repository.area.colr.MarginCallRequestV04.mmMarginDetailsDueToB,
						com.tools20022.repository.area.colr.MarginCallRequestV04.mmRequirementDetailsDueToA, com.tools20022.repository.area.colr.MarginCallRequestV04.mmRequirementDetailsDueToB,
						com.tools20022.repository.area.colr.MarginCallRequestV04.mmExpectedCollateralDueToA, com.tools20022.repository.area.colr.MarginCallRequestV04.mmExpectedCollateralDueToB,
						com.tools20022.repository.area.colr.MarginCallRequestV04.mmMarginCallDetails, com.tools20022.repository.area.colr.MarginCallRequestV04.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "colr";
						messageFunctionality = "003";
						version = "04";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return MarginCallRequestV04.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "TxId", required = true)
	public Max35Text getTransactionIdentification() {
		return transactionIdentification;
	}

	public void setTransactionIdentification(Max35Text transactionIdentification) {
		this.transactionIdentification = transactionIdentification;
	}

	@XmlElement(name = "Oblgtn", required = true)
	public Obligation4 getObligation() {
		return obligation;
	}

	public void setObligation(Obligation4 obligation) {
		this.obligation = obligation;
	}

	@XmlElement(name = "Agrmt")
	public Agreement4 getAgreement() {
		return agreement;
	}

	public void setAgreement(Agreement4 agreement) {
		this.agreement = agreement;
	}

	@XmlElement(name = "MrgnCallRslt", required = true)
	public MarginCallResult3 getMarginCallResult() {
		return marginCallResult;
	}

	public void setMarginCallResult(MarginCallResult3 marginCallResult) {
		this.marginCallResult = marginCallResult;
	}

	@XmlElement(name = "MrgnDtlsDueToA")
	public MarginCall1 getMarginDetailsDueToA() {
		return marginDetailsDueToA;
	}

	public void setMarginDetailsDueToA(MarginCall1 marginDetailsDueToA) {
		this.marginDetailsDueToA = marginDetailsDueToA;
	}

	@XmlElement(name = "MrgnDtlsDueToB")
	public MarginCall1 getMarginDetailsDueToB() {
		return marginDetailsDueToB;
	}

	public void setMarginDetailsDueToB(MarginCall1 marginDetailsDueToB) {
		this.marginDetailsDueToB = marginDetailsDueToB;
	}

	@XmlElement(name = "RqrmntDtlsDueToA")
	public MarginRequirement1Choice getRequirementDetailsDueToA() {
		return requirementDetailsDueToA;
	}

	public void setRequirementDetailsDueToA(MarginRequirement1Choice requirementDetailsDueToA) {
		this.requirementDetailsDueToA = requirementDetailsDueToA;
	}

	@XmlElement(name = "RqrmntDtlsDueToB")
	public MarginRequirement1Choice getRequirementDetailsDueToB() {
		return requirementDetailsDueToB;
	}

	public void setRequirementDetailsDueToB(MarginRequirement1Choice requirementDetailsDueToB) {
		this.requirementDetailsDueToB = requirementDetailsDueToB;
	}

	@XmlElement(name = "XpctdCollDueToA")
	public ExpectedCollateral2Choice getExpectedCollateralDueToA() {
		return expectedCollateralDueToA;
	}

	public void setExpectedCollateralDueToA(ExpectedCollateral2Choice expectedCollateralDueToA) {
		this.expectedCollateralDueToA = expectedCollateralDueToA;
	}

	@XmlElement(name = "XpctdCollDueToB")
	public ExpectedCollateral2Choice getExpectedCollateralDueToB() {
		return expectedCollateralDueToB;
	}

	public void setExpectedCollateralDueToB(ExpectedCollateral2Choice expectedCollateralDueToB) {
		this.expectedCollateralDueToB = expectedCollateralDueToB;
	}

	@XmlElement(name = "MrgnCallDtls")
	public List<MarginCall2> getMarginCallDetails() {
		return marginCallDetails;
	}

	public void setMarginCallDetails(List<MarginCall2> marginCallDetails) {
		this.marginCallDetails = marginCallDetails;
	}

	@XmlElement(name = "SplmtryData")
	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData;
	}

	public void setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = supplementaryData;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:colr.003.04.04")
	static public class Document {
		@XmlElement(name = "MrgnCallReq", required = true)
		public MarginCallRequestV04 messageBody;
	}
}