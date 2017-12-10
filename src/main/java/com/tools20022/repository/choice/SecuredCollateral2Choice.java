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
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.CollateralValuation;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CollateralValuation6;
import com.tools20022.repository.msg.CollateralValuation7;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides the collateral details for the secured markets.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuredCollateral2Choice#mmSingleCollateral
 * SecuredCollateral2Choice.mmSingleCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuredCollateral2Choice#mmMultipleCollateral
 * SecuredCollateral2Choice.mmMultipleCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuredCollateral2Choice#mmPoolCollateral
 * SecuredCollateral2Choice.mmPoolCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuredCollateral2Choice#mmOtherCollateral
 * SecuredCollateral2Choice.mmOtherCollateral}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CollateralValuation
 * CollateralValuation}</li>
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
 * "SecuredCollateral2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides the collateral details for the secured markets."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SecuredCollateral2Choice", propOrder = {"singleCollateral", "multipleCollateral", "poolCollateral", "otherCollateral"})
public class SecuredCollateral2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected CollateralValuation6 singleCollateral;
	/**
	 * Identifies the security pledged via a single ISIN.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CollateralValuation6
	 * CollateralValuation6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CollateralValuation
	 * CollateralValuation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecuredCollateral2Choice
	 * SecuredCollateral2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SnglColl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SingleCollateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the security pledged via a single ISIN."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSingleCollateral = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CollateralValuation.mmObject();
			componentContext_lazy = () -> SecuredCollateral2Choice.mmObject();
			isDerived = false;
			xmlTag = "SnglColl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SingleCollateral";
			definition = "Identifies the security pledged via a single ISIN.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CollateralValuation6.mmObject();
		}
	};
	protected List<CollateralValuation6> multipleCollateral;
	/**
	 * Identifies all securities pledged when the transaction is collateralised
	 * with more than one security. <br>
	 * Usage:<br>
	 * In case of multi-collateral repo, the nominal amount of each
	 * collateralised security must be provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CollateralValuation6
	 * CollateralValuation6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CollateralValuation
	 * CollateralValuation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecuredCollateral2Choice
	 * SecuredCollateral2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MltplColl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultipleCollateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies all securities pledged when the transaction is collateralised with more than one security. \r\nUsage:\r\nIn case of multi-collateral repo, the nominal amount of each collateralised security must be provided."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMultipleCollateral = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CollateralValuation.mmObject();
			componentContext_lazy = () -> SecuredCollateral2Choice.mmObject();
			isDerived = false;
			xmlTag = "MltplColl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultipleCollateral";
			definition = "Identifies all securities pledged when the transaction is collateralised with more than one security. \r\nUsage:\r\nIn case of multi-collateral repo, the nominal amount of each collateralised security must be provided.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CollateralValuation6.mmObject();
		}
	};
	protected CollateralValuation6 poolCollateral;
	/**
	 * Identifies the pooling of repos in which the collateral basket is
	 * identified by an ISIN. <br>
	 * <br>
	 * Usage: When the collateral basket is identified by an ISIN, the basket
	 * ISIN shall be reported.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CollateralValuation6
	 * CollateralValuation6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CollateralValuation
	 * CollateralValuation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecuredCollateral2Choice
	 * SecuredCollateral2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PoolColl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PoolCollateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the pooling of repos in which the collateral basket is identified by an ISIN. \r\n\r\nUsage: When the collateral basket is identified by an ISIN, the basket ISIN shall be reported."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPoolCollateral = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CollateralValuation.mmObject();
			componentContext_lazy = () -> SecuredCollateral2Choice.mmObject();
			isDerived = false;
			xmlTag = "PoolColl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PoolCollateral";
			definition = "Identifies the pooling of repos in which the collateral basket is identified by an ISIN. \r\n\r\nUsage: When the collateral basket is identified by an ISIN, the basket ISIN shall be reported.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CollateralValuation6.mmObject();
		}
	};
	protected List<CollateralValuation7> otherCollateral;
	/**
	 * Identifies the collateral when the asset class pledged as collateral does
	 * not correspond to an ISIN.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CollateralValuation7
	 * CollateralValuation7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CollateralValuation
	 * CollateralValuation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecuredCollateral2Choice
	 * SecuredCollateral2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrColl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherCollateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the collateral when the asset class pledged as collateral does not correspond to an ISIN."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOtherCollateral = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CollateralValuation.mmObject();
			componentContext_lazy = () -> SecuredCollateral2Choice.mmObject();
			isDerived = false;
			xmlTag = "OthrColl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherCollateral";
			definition = "Identifies the collateral when the asset class pledged as collateral does not correspond to an ISIN.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CollateralValuation7.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SecuredCollateral2Choice.mmSingleCollateral, SecuredCollateral2Choice.mmMultipleCollateral, SecuredCollateral2Choice.mmPoolCollateral, SecuredCollateral2Choice.mmOtherCollateral);
				trace_lazy = () -> CollateralValuation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuredCollateral2Choice";
				definition = "Provides the collateral details for the secured markets.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "SnglColl", required = true)
	public CollateralValuation6 getSingleCollateral() {
		return singleCollateral;
	}

	public void setSingleCollateral(CollateralValuation6 singleCollateral) {
		this.singleCollateral = singleCollateral;
	}

	@XmlElement(name = "MltplColl", required = true)
	public List<CollateralValuation6> getMultipleCollateral() {
		return multipleCollateral;
	}

	public void setMultipleCollateral(List<CollateralValuation6> multipleCollateral) {
		this.multipleCollateral = multipleCollateral;
	}

	@XmlElement(name = "PoolColl", required = true)
	public CollateralValuation6 getPoolCollateral() {
		return poolCollateral;
	}

	public void setPoolCollateral(CollateralValuation6 poolCollateral) {
		this.poolCollateral = poolCollateral;
	}

	@XmlElement(name = "OthrColl", required = true)
	public List<CollateralValuation7> getOtherCollateral() {
		return otherCollateral;
	}

	public void setOtherCollateral(List<CollateralValuation7> otherCollateral) {
		this.otherCollateral = otherCollateral;
	}
}