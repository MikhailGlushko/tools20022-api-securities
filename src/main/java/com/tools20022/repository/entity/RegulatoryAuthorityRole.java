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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMAggregation;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.Country;
import com.tools20022.repository.entity.RegulatoryReport;
import com.tools20022.repository.entity.Role;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.MarketIdentification92;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Entity requiring the regulatory reporting information.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="RegulatoryAuthorityRole"
 * src="doc-files/RegulatoryAuthorityRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Role Role}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegulatoryAuthorityRole#mmRegulatoryReport
 * RegulatoryAuthorityRole.mmRegulatoryReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegulatoryAuthorityRole#mmCountry
 * RegulatoryAuthorityRole.mmCountry}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Country#mmNationalRegulatoryAuthority
 * Country.mmNationalRegulatoryAuthority}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegulatoryReport#mmAuthority
 * RegulatoryReport.mmAuthority}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarketIdentification92#mmAuthorityName
 * MarketIdentification92.mmAuthorityName}</li>
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
 * "RegulatoryAuthorityRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Entity requiring the regulatory reporting information."</li>
 * </ul>
 */
public class RegulatoryAuthorityRole extends Role {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected RegulatoryReport regulatoryReport;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RegulatoryReport#mmAuthority
	 * RegulatoryReport.mmAuthority}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RegulatoryReport
	 * RegulatoryReport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RegulatoryAuthorityRole
	 * RegulatoryAuthorityRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegulatoryReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Report which was requested by the regulatory authority."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<RegulatoryAuthorityRole, Optional<RegulatoryReport>> mmRegulatoryReport = new MMBusinessAssociationEnd<RegulatoryAuthorityRole, Optional<RegulatoryReport>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RegulatoryAuthorityRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RegulatoryReport";
			definition = "Report which was requested by the regulatory authority.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.RegulatoryReport.mmAuthority;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RegulatoryReport.mmObject();
		}

		@Override
		public Optional<RegulatoryReport> getValue(RegulatoryAuthorityRole obj) {
			return obj.getRegulatoryReport();
		}

		@Override
		public void setValue(RegulatoryAuthorityRole obj, Optional<RegulatoryReport> value) {
			obj.setRegulatoryReport(value.orElse(null));
		}
	};
	protected Country country;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Country#mmNationalRegulatoryAuthority
	 * Country.mmNationalRegulatoryAuthority}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Country Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RegulatoryAuthorityRole
	 * RegulatoryAuthorityRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Country"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country for which the regulatory authority operates."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<RegulatoryAuthorityRole, com.tools20022.repository.entity.Country> mmCountry = new MMBusinessAssociationEnd<RegulatoryAuthorityRole, com.tools20022.repository.entity.Country>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RegulatoryAuthorityRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Country";
			definition = "Country for which the regulatory authority operates.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Country.mmNationalRegulatoryAuthority;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Country.mmObject();
		}

		@Override
		public com.tools20022.repository.entity.Country getValue(RegulatoryAuthorityRole obj) {
			return obj.getCountry();
		}

		@Override
		public void setValue(RegulatoryAuthorityRole obj, com.tools20022.repository.entity.Country value) {
			obj.setCountry(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RegulatoryAuthorityRole";
				definition = "Entity requiring the regulatory reporting information.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Country.mmNationalRegulatoryAuthority, com.tools20022.repository.entity.RegulatoryReport.mmAuthority);
				derivationElement_lazy = () -> Arrays.asList(MarketIdentification92.mmAuthorityName);
				superType_lazy = () -> Role.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.RegulatoryAuthorityRole.mmRegulatoryReport, com.tools20022.repository.entity.RegulatoryAuthorityRole.mmCountry);
			}

			@Override
			public Class<?> getInstanceClass() {
				return RegulatoryAuthorityRole.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<RegulatoryReport> getRegulatoryReport() {
		return regulatoryReport == null ? Optional.empty() : Optional.of(regulatoryReport);
	}

	public RegulatoryAuthorityRole setRegulatoryReport(com.tools20022.repository.entity.RegulatoryReport regulatoryReport) {
		this.regulatoryReport = regulatoryReport;
		return this;
	}

	public Country getCountry() {
		return country;
	}

	public RegulatoryAuthorityRole setCountry(com.tools20022.repository.entity.Country country) {
		this.country = Objects.requireNonNull(country);
		return this;
	}
}