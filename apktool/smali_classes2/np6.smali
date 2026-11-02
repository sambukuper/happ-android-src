.class public final Lnp6;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public synthetic g0:Ljava/lang/Object;

.field public final synthetic h0:Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;


# direct methods
.method public constructor <init>(Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;Lq51;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lnp6;->h0:Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Luy7;-><init>(ILq51;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFileV2;

    .line 2
    .line 3
    check-cast p2, Lq51;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, Lnp6;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lnp6;

    .line 10
    .line 11
    sget-object p1, Ldn8;->a:Ldn8;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lnp6;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-object p1
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 1

    .line 1
    new-instance v0, Lnp6;

    .line 2
    .line 3
    iget-object p0, p0, Lnp6;->h0:Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;

    .line 4
    .line 5
    invoke-direct {v0, p0, p1}, Lnp6;-><init>(Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;Lq51;)V

    .line 6
    .line 7
    .line 8
    iput-object p2, v0, Lnp6;->g0:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Lnp6;->g0:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFileV2;

    .line 4
    .line 5
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    instance-of p1, v0, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFileV2$Success;

    .line 9
    .line 10
    iget-object p0, p0, Lnp6;->h0:Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;

    .line 11
    .line 12
    if-nez p1, :cond_f

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    goto/16 :goto_5

    .line 17
    .line 18
    :cond_0
    instance-of p1, v0, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFileV2$Error$Failure;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    if-nez p1, :cond_e

    .line 22
    .line 23
    instance-of p1, v0, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFileV2$Error$LinkNotCorrect;

    .line 24
    .line 25
    if-eqz p1, :cond_1

    .line 26
    .line 27
    goto/16 :goto_4

    .line 28
    .line 29
    :cond_1
    instance-of p1, v0, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFileV2$Loading$Progress;

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    if-nez p1, :cond_3

    .line 33
    .line 34
    instance-of p1, v0, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFileV2$Loading$Start;

    .line 35
    .line 36
    if-eqz p1, :cond_2

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    invoke-static {}, Lb61;->c()V

    .line 40
    .line 41
    .line 42
    return-object v2

    .line 43
    :cond_3
    :goto_0
    check-cast v0, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFileV2$Loading;

    .line 44
    .line 45
    sget p1, Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;->X0:I

    .line 46
    .line 47
    iget-object p1, p0, Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;->Q0:Ls6;

    .line 48
    .line 49
    const-string v3, "binding"

    .line 50
    .line 51
    if-eqz p1, :cond_d

    .line 52
    .line 53
    iget-object p1, p1, Ls6;->p0:Landroid/widget/ImageView;

    .line 54
    .line 55
    invoke-virtual {p1}, Landroid/view/View;->getAnimation()Landroid/view/animation/Animation;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    if-nez p1, :cond_8

    .line 60
    .line 61
    iget-object p1, p0, Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;->Q0:Ls6;

    .line 62
    .line 63
    if-eqz p1, :cond_7

    .line 64
    .line 65
    iget-object p1, p1, Ls6;->p0:Landroid/widget/ImageView;

    .line 66
    .line 67
    sget v4, Lq36;->ic_progress_circle_24dp:I

    .line 68
    .line 69
    invoke-virtual {p1, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 70
    .line 71
    .line 72
    iget-object p1, p0, Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;->Q0:Ls6;

    .line 73
    .line 74
    if-eqz p1, :cond_6

    .line 75
    .line 76
    iget-object p1, p1, Ls6;->p0:Landroid/widget/ImageView;

    .line 77
    .line 78
    invoke-static {}, Lz91;->E()Landroid/view/animation/RotateAnimation;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    invoke-virtual {p1, v4}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 83
    .line 84
    .line 85
    iget-object p1, p0, Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;->Q0:Ls6;

    .line 86
    .line 87
    if-eqz p1, :cond_5

    .line 88
    .line 89
    iget-object p1, p1, Ls6;->p0:Landroid/widget/ImageView;

    .line 90
    .line 91
    invoke-virtual {p1, v1}, Landroid/view/View;->setClickable(Z)V

    .line 92
    .line 93
    .line 94
    iget-object p1, p0, Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;->Q0:Ls6;

    .line 95
    .line 96
    if-eqz p1, :cond_4

    .line 97
    .line 98
    iget-object p1, p1, Ls6;->p0:Landroid/widget/ImageView;

    .line 99
    .line 100
    invoke-virtual {p1, v1}, Landroid/view/View;->setFocusable(Z)V

    .line 101
    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_4
    invoke-static {v3}, Ldh3;->T(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    throw v2

    .line 108
    :cond_5
    invoke-static {v3}, Ldh3;->T(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    throw v2

    .line 112
    :cond_6
    invoke-static {v3}, Ldh3;->T(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    throw v2

    .line 116
    :cond_7
    invoke-static {v3}, Ldh3;->T(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    throw v2

    .line 120
    :cond_8
    :goto_1
    iget-object p1, p0, Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;->Q0:Ls6;

    .line 121
    .line 122
    if-eqz p1, :cond_c

    .line 123
    .line 124
    iget-object p1, p1, Ls6;->F0:Lsu/happ/proxyutility/ui/foundation/component/HappTextView;

    .line 125
    .line 126
    instance-of v1, v0, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFileV2$Loading$Progress;

    .line 127
    .line 128
    if-eqz v1, :cond_9

    .line 129
    .line 130
    check-cast v0, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFileV2$Loading$Progress;

    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_9
    move-object v0, v2

    .line 134
    :goto_2
    if-eqz v0, :cond_a

    .line 135
    .line 136
    invoke-virtual {v0}, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFileV2$Loading$Progress;->d()Ljava/lang/Integer;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    :cond_a
    if-nez v2, :cond_b

    .line 141
    .line 142
    sget v0, Ly46;->downloading_status_unknown:I

    .line 143
    .line 144
    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    goto :goto_3

    .line 149
    :cond_b
    sget v0, Ly46;->downloading_status:I

    .line 150
    .line 151
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    :goto_3
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 160
    .line 161
    .line 162
    goto :goto_6

    .line 163
    :cond_c
    invoke-static {v3}, Ldh3;->T(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    throw v2

    .line 167
    :cond_d
    invoke-static {v3}, Ldh3;->T(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    throw v2

    .line 171
    :cond_e
    :goto_4
    sget p1, Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;->X0:I

    .line 172
    .line 173
    invoke-virtual {p0, v1}, Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;->F(Z)V

    .line 174
    .line 175
    .line 176
    goto :goto_6

    .line 177
    :cond_f
    :goto_5
    sget p1, Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;->X0:I

    .line 178
    .line 179
    const/4 p1, 0x1

    .line 180
    invoke-virtual {p0, p1}, Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;->F(Z)V

    .line 181
    .line 182
    .line 183
    :goto_6
    sget-object p0, Ldn8;->a:Ldn8;

    .line 184
    .line 185
    return-object p0
.end method
