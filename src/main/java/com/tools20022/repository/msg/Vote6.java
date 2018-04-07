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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Resolution;
import com.tools20022.repository.entity.Vote;
import com.tools20022.repository.entity.VoteInstructionRequest;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Decision of the voting party for one resolution. Several types of decisions
 * can be indicated to allow for split vote specification.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Vote6#mmIssuerLabel
 * Vote6.mmIssuerLabel}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Vote6#mmFor Vote6.mmFor}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Vote6#mmAgainst
 * Vote6.mmAgainst}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Vote6#mmAbstain
 * Vote6.mmAbstain}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Vote6#mmWithhold
 * Vote6.mmWithhold}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Vote6#mmWithManagement
 * Vote6.mmWithManagement}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Vote6#mmAgainstManagement
 * Vote6.mmAgainstManagement}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Vote6#mmDiscretionary
 * Vote6.mmDiscretionary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Vote6#mmOneYear
 * Vote6.mmOneYear}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Vote6#mmTwoYears
 * Vote6.mmTwoYears}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Vote6#mmThreeYears
 * Vote6.mmThreeYears}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Vote6#mmNoAction
 * Vote6.mmNoAction}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Vote6#mmWithdrawn
 * Vote6.mmWithdrawn}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Vote Vote}</li>
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
 * "Vote6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Decision of the voting party for one resolution. Several types of decisions can be indicated to allow for split vote specification."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Vote6", propOrder = {"issuerLabel", "for_", "against", "abstain", "withhold", "withManagement", "againstManagement", "discretionary", "oneYear", "twoYears", "threeYears", "noAction", "withdrawn"})
public class Vote6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "IssrLabl", required = true)
	protected Max35Text issuerLabel;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Resolution#mmIssuerLabel
	 * Resolution.mmIssuerLabel}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Vote6
	 * Vote6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IssrLabl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerLabel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Numbering of the resolution as specified by the issuer or its agent."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Vote6, Max35Text> mmIssuerLabel = new MMMessageAttribute<Vote6, Max35Text>() {
		{
			businessElementTrace_lazy = () -> Resolution.mmIssuerLabel;
			componentContext_lazy = () -> com.tools20022.repository.msg.Vote6.mmObject();
			isDerived = false;
			xmlTag = "IssrLabl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerLabel";
			definition = "Numbering of the resolution as specified by the issuer or its agent.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Vote6 obj) {
			return obj.getIssuerLabel();
		}

		@Override
		public void setValue(Vote6 obj, Max35Text value) {
			obj.setIssuerLabel(value);
		}
	};
	@XmlElement(name = "For")
	protected Number for_;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Vote#mmFor Vote.mmFor}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Vote6
	 * Vote6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "For"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "For"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of votes in favour of one resolution."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Vote6, Optional<Number>> mmFor = new MMMessageAttribute<Vote6, Optional<Number>>() {
		{
			businessElementTrace_lazy = () -> Vote.mmFor;
			componentContext_lazy = () -> com.tools20022.repository.msg.Vote6.mmObject();
			isDerived = false;
			xmlTag = "For";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "For";
			definition = "Number of votes in favour of one resolution.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(Vote6 obj) {
			return obj.getFor();
		}

		@Override
		public void setValue(Vote6 obj, Optional<Number> value) {
			obj.setFor(value.orElse(null));
		}
	};
	@XmlElement(name = "Agnst")
	protected Number against;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Vote#mmAgainst
	 * Vote.mmAgainst}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Vote6
	 * Vote6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Agnst"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Against"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of votes against one resolution."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Vote6, Optional<Number>> mmAgainst = new MMMessageAttribute<Vote6, Optional<Number>>() {
		{
			businessElementTrace_lazy = () -> Vote.mmAgainst;
			componentContext_lazy = () -> com.tools20022.repository.msg.Vote6.mmObject();
			isDerived = false;
			xmlTag = "Agnst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Against";
			definition = "Number of votes against one resolution.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(Vote6 obj) {
			return obj.getAgainst();
		}

		@Override
		public void setValue(Vote6 obj, Optional<Number> value) {
			obj.setAgainst(value.orElse(null));
		}
	};
	@XmlElement(name = "Abstn")
	protected Number abstain;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Vote#mmAbstain
	 * Vote.mmAbstain}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Vote6
	 * Vote6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Abstn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Abstain"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of votes expressed as abstain for one resolution."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Vote6, Optional<Number>> mmAbstain = new MMMessageAttribute<Vote6, Optional<Number>>() {
		{
			businessElementTrace_lazy = () -> Vote.mmAbstain;
			componentContext_lazy = () -> com.tools20022.repository.msg.Vote6.mmObject();
			isDerived = false;
			xmlTag = "Abstn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Abstain";
			definition = "Number of votes expressed as abstain for one resolution.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(Vote6 obj) {
			return obj.getAbstain();
		}

		@Override
		public void setValue(Vote6 obj, Optional<Number> value) {
			obj.setAbstain(value.orElse(null));
		}
	};
	@XmlElement(name = "Wthhld")
	protected Number withhold;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Vote#mmWithhold
	 * Vote.mmWithhold}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Vote6
	 * Vote6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Wthhld"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Withhold"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of votes withheld for one resolution."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Vote6, Optional<Number>> mmWithhold = new MMMessageAttribute<Vote6, Optional<Number>>() {
		{
			businessElementTrace_lazy = () -> Vote.mmWithhold;
			componentContext_lazy = () -> com.tools20022.repository.msg.Vote6.mmObject();
			isDerived = false;
			xmlTag = "Wthhld";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Withhold";
			definition = "Number of votes withheld for one resolution.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(Vote6 obj) {
			return obj.getWithhold();
		}

		@Override
		public void setValue(Vote6 obj, Optional<Number> value) {
			obj.setWithhold(value.orElse(null));
		}
	};
	@XmlElement(name = "WthMgmt")
	protected Number withManagement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Vote#mmWithManagement
	 * Vote.mmWithManagement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Vote6
	 * Vote6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "WthMgmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithManagement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of votes in line with the votes of the management."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Vote6, Optional<Number>> mmWithManagement = new MMMessageAttribute<Vote6, Optional<Number>>() {
		{
			businessElementTrace_lazy = () -> Vote.mmWithManagement;
			componentContext_lazy = () -> com.tools20022.repository.msg.Vote6.mmObject();
			isDerived = false;
			xmlTag = "WthMgmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithManagement";
			definition = "Number of votes in line with the votes of the management.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(Vote6 obj) {
			return obj.getWithManagement();
		}

		@Override
		public void setValue(Vote6 obj, Optional<Number> value) {
			obj.setWithManagement(value.orElse(null));
		}
	};
	@XmlElement(name = "AgnstMgmt")
	protected Number againstManagement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Vote#mmAgainstManagement
	 * Vote.mmAgainstManagement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Vote6
	 * Vote6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AgnstMgmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgainstManagement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of votes against the voting recommendation of the management."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Vote6, Optional<Number>> mmAgainstManagement = new MMMessageAttribute<Vote6, Optional<Number>>() {
		{
			businessElementTrace_lazy = () -> Vote.mmAgainstManagement;
			componentContext_lazy = () -> com.tools20022.repository.msg.Vote6.mmObject();
			isDerived = false;
			xmlTag = "AgnstMgmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgainstManagement";
			definition = "Number of votes against the voting recommendation of the management.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(Vote6 obj) {
			return obj.getAgainstManagement();
		}

		@Override
		public void setValue(Vote6 obj, Optional<Number> value) {
			obj.setAgainstManagement(value.orElse(null));
		}
	};
	@XmlElement(name = "Dscrtnry")
	protected Number discretionary;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.VoteInstructionRequest#mmDiscretionary
	 * VoteInstructionRequest.mmDiscretionary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Vote6
	 * Vote6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dscrtnry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Discretionary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of votes for which decision is left to the party that will exercise the voting right."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Vote6, Optional<Number>> mmDiscretionary = new MMMessageAttribute<Vote6, Optional<Number>>() {
		{
			businessElementTrace_lazy = () -> VoteInstructionRequest.mmDiscretionary;
			componentContext_lazy = () -> com.tools20022.repository.msg.Vote6.mmObject();
			isDerived = false;
			xmlTag = "Dscrtnry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Discretionary";
			definition = "Number of votes for which decision is left to the party that will exercise the voting right.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(Vote6 obj) {
			return obj.getDiscretionary();
		}

		@Override
		public void setValue(Vote6 obj, Optional<Number> value) {
			obj.setDiscretionary(value.orElse(null));
		}
	};
	@XmlElement(name = "OneYr")
	protected Number oneYear;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Vote#mmOneYear
	 * Vote.mmOneYear}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Vote6
	 * Vote6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OneYr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OneYear"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of votes in favour for one year for \"say on pay\" type of resolution."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Vote6, Optional<Number>> mmOneYear = new MMMessageAttribute<Vote6, Optional<Number>>() {
		{
			businessElementTrace_lazy = () -> Vote.mmOneYear;
			componentContext_lazy = () -> com.tools20022.repository.msg.Vote6.mmObject();
			isDerived = false;
			xmlTag = "OneYr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OneYear";
			definition = "Number of votes in favour for one year for \"say on pay\" type of resolution.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(Vote6 obj) {
			return obj.getOneYear();
		}

		@Override
		public void setValue(Vote6 obj, Optional<Number> value) {
			obj.setOneYear(value.orElse(null));
		}
	};
	@XmlElement(name = "TwoYrs")
	protected Number twoYears;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Vote#mmTwoYears
	 * Vote.mmTwoYears}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Vote6
	 * Vote6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TwoYrs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoYears"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of votes in favour of two years for \"say on pay\" type of resolution."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Vote6, Optional<Number>> mmTwoYears = new MMMessageAttribute<Vote6, Optional<Number>>() {
		{
			businessElementTrace_lazy = () -> Vote.mmTwoYears;
			componentContext_lazy = () -> com.tools20022.repository.msg.Vote6.mmObject();
			isDerived = false;
			xmlTag = "TwoYrs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoYears";
			definition = "Number of votes in favour of two years for \"say on pay\" type of resolution.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(Vote6 obj) {
			return obj.getTwoYears();
		}

		@Override
		public void setValue(Vote6 obj, Optional<Number> value) {
			obj.setTwoYears(value.orElse(null));
		}
	};
	@XmlElement(name = "ThreeYrs")
	protected Number threeYears;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Vote#mmThreeYears
	 * Vote.mmThreeYears}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Vote6
	 * Vote6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ThreeYrs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ThreeYears"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of votes in favour of three years for \"say on pay\" type of resolution."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Vote6, Optional<Number>> mmThreeYears = new MMMessageAttribute<Vote6, Optional<Number>>() {
		{
			businessElementTrace_lazy = () -> Vote.mmThreeYears;
			componentContext_lazy = () -> com.tools20022.repository.msg.Vote6.mmObject();
			isDerived = false;
			xmlTag = "ThreeYrs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThreeYears";
			definition = "Number of votes in favour of three years for \"say on pay\" type of resolution.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(Vote6 obj) {
			return obj.getThreeYears();
		}

		@Override
		public void setValue(Vote6 obj, Optional<Number> value) {
			obj.setThreeYears(value.orElse(null));
		}
	};
	@XmlElement(name = "NoActn")
	protected Number noAction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Vote#mmNoAction
	 * Vote.mmNoAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Vote6
	 * Vote6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NoActn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of votes for which no action has been taken."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Vote6, Optional<Number>> mmNoAction = new MMMessageAttribute<Vote6, Optional<Number>>() {
		{
			businessElementTrace_lazy = () -> Vote.mmNoAction;
			componentContext_lazy = () -> com.tools20022.repository.msg.Vote6.mmObject();
			isDerived = false;
			xmlTag = "NoActn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAction";
			definition = "Number of votes for which no action has been taken.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(Vote6 obj) {
			return obj.getNoAction();
		}

		@Override
		public void setValue(Vote6 obj, Optional<Number> value) {
			obj.setNoAction(value.orElse(null));
		}
	};
	@XmlElement(name = "Wdrwn")
	protected YesNoIndicator withdrawn;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Vote#mmWithdrawn
	 * Vote.mmWithdrawn}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Vote6
	 * Vote6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Wdrwn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Withdrawn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Resolution withdrawn at the meeting."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Vote6, Optional<YesNoIndicator>> mmWithdrawn = new MMMessageAttribute<Vote6, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> Vote.mmWithdrawn;
			componentContext_lazy = () -> com.tools20022.repository.msg.Vote6.mmObject();
			isDerived = false;
			xmlTag = "Wdrwn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Withdrawn";
			definition = "Resolution withdrawn at the meeting.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(Vote6 obj) {
			return obj.getWithdrawn();
		}

		@Override
		public void setValue(Vote6 obj, Optional<YesNoIndicator> value) {
			obj.setWithdrawn(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Vote6.mmIssuerLabel, com.tools20022.repository.msg.Vote6.mmFor, com.tools20022.repository.msg.Vote6.mmAgainst,
						com.tools20022.repository.msg.Vote6.mmAbstain, com.tools20022.repository.msg.Vote6.mmWithhold, com.tools20022.repository.msg.Vote6.mmWithManagement, com.tools20022.repository.msg.Vote6.mmAgainstManagement,
						com.tools20022.repository.msg.Vote6.mmDiscretionary, com.tools20022.repository.msg.Vote6.mmOneYear, com.tools20022.repository.msg.Vote6.mmTwoYears, com.tools20022.repository.msg.Vote6.mmThreeYears,
						com.tools20022.repository.msg.Vote6.mmNoAction, com.tools20022.repository.msg.Vote6.mmWithdrawn);
				trace_lazy = () -> Vote.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Vote6";
				definition = "Decision of the voting party for one resolution. Several types of decisions can be indicated to allow for split vote specification.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getIssuerLabel() {
		return issuerLabel;
	}

	public Vote6 setIssuerLabel(Max35Text issuerLabel) {
		this.issuerLabel = Objects.requireNonNull(issuerLabel);
		return this;
	}

	public Optional<Number> getFor() {
		return for_ == null ? Optional.empty() : Optional.of(for_);
	}

	public Vote6 setFor(Number for_) {
		this.for_ = for_;
		return this;
	}

	public Optional<Number> getAgainst() {
		return against == null ? Optional.empty() : Optional.of(against);
	}

	public Vote6 setAgainst(Number against) {
		this.against = against;
		return this;
	}

	public Optional<Number> getAbstain() {
		return abstain == null ? Optional.empty() : Optional.of(abstain);
	}

	public Vote6 setAbstain(Number abstain) {
		this.abstain = abstain;
		return this;
	}

	public Optional<Number> getWithhold() {
		return withhold == null ? Optional.empty() : Optional.of(withhold);
	}

	public Vote6 setWithhold(Number withhold) {
		this.withhold = withhold;
		return this;
	}

	public Optional<Number> getWithManagement() {
		return withManagement == null ? Optional.empty() : Optional.of(withManagement);
	}

	public Vote6 setWithManagement(Number withManagement) {
		this.withManagement = withManagement;
		return this;
	}

	public Optional<Number> getAgainstManagement() {
		return againstManagement == null ? Optional.empty() : Optional.of(againstManagement);
	}

	public Vote6 setAgainstManagement(Number againstManagement) {
		this.againstManagement = againstManagement;
		return this;
	}

	public Optional<Number> getDiscretionary() {
		return discretionary == null ? Optional.empty() : Optional.of(discretionary);
	}

	public Vote6 setDiscretionary(Number discretionary) {
		this.discretionary = discretionary;
		return this;
	}

	public Optional<Number> getOneYear() {
		return oneYear == null ? Optional.empty() : Optional.of(oneYear);
	}

	public Vote6 setOneYear(Number oneYear) {
		this.oneYear = oneYear;
		return this;
	}

	public Optional<Number> getTwoYears() {
		return twoYears == null ? Optional.empty() : Optional.of(twoYears);
	}

	public Vote6 setTwoYears(Number twoYears) {
		this.twoYears = twoYears;
		return this;
	}

	public Optional<Number> getThreeYears() {
		return threeYears == null ? Optional.empty() : Optional.of(threeYears);
	}

	public Vote6 setThreeYears(Number threeYears) {
		this.threeYears = threeYears;
		return this;
	}

	public Optional<Number> getNoAction() {
		return noAction == null ? Optional.empty() : Optional.of(noAction);
	}

	public Vote6 setNoAction(Number noAction) {
		this.noAction = noAction;
		return this;
	}

	public Optional<YesNoIndicator> getWithdrawn() {
		return withdrawn == null ? Optional.empty() : Optional.of(withdrawn);
	}

	public Vote6 setWithdrawn(YesNoIndicator withdrawn) {
		this.withdrawn = withdrawn;
		return this;
	}
}