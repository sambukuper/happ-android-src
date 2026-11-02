.class public final synthetic Lip6;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;

.field public final synthetic Z:Ljava/lang/String;

.field public final synthetic f0:Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

.field public final synthetic g0:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;Ljava/lang/String;Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;Ljava/lang/String;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, Lip6;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lip6;->Y:Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;

    .line 4
    .line 5
    iput-object p2, p0, Lip6;->Z:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p3, p0, Lip6;->f0:Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 8
    .line 9
    iput-object p4, p0, Lip6;->g0:Ljava/lang/String;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, Lip6;->X:B

    .line 2
    .line 3
    const-string v1, "binding"

    .line 4
    .line 5
    sget-object v2, Ldn8;->a:Ldn8;

    .line 6
    .line 7
    const/4 v3, 0x3

    .line 8
    iget-object v4, p0, Lip6;->f0:Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 9
    .line 10
    check-cast p1, Ljava/lang/String;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    sget v0, Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;->X0:I

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-object v6, p0, Lip6;->Y:Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;

    .line 25
    .line 26
    iget-object v8, p0, Lip6;->Z:Ljava/lang/String;

    .line 27
    .line 28
    if-nez v0, :cond_0

    .line 29
    .line 30
    new-instance p1, Lzw5;

    .line 31
    .line 32
    const/16 v0, 0xe

    .line 33
    .line 34
    invoke-direct {p1, v0}, Lzw5;-><init>(B)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v6, v8, p1}, Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;->I(Ljava/lang/String;Lgn2;)Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    invoke-virtual {v4}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->f()Lsu/happ/proxyutility/dto/RouteSettings;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/RouteSettings;->s()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_1

    .line 54
    .line 55
    new-instance v0, Lm40;

    .line 56
    .line 57
    const/16 v4, 0x19

    .line 58
    .line 59
    invoke-direct {v0, p1, v4}, Lm40;-><init>(Ljava/lang/String;B)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v6, v8, v0}, Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;->I(Ljava/lang/String;Lgn2;)Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 63
    .line 64
    .line 65
    :cond_1
    :goto_0
    new-instance p1, Lzw5;

    .line 66
    .line 67
    const/16 v0, 0xf

    .line 68
    .line 69
    invoke-direct {p1, v0}, Lzw5;-><init>(B)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v6, v8, p1}, Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;->I(Ljava/lang/String;Lgn2;)Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    iget-object v0, v6, Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;->Q0:Ls6;

    .line 77
    .line 78
    const/4 v9, 0x0

    .line 79
    if-eqz v0, :cond_3

    .line 80
    .line 81
    iget-object v0, v0, Ls6;->G0:Lsu/happ/proxyutility/ui/foundation/component/HappTextView;

    .line 82
    .line 83
    if-eqz p1, :cond_2

    .line 84
    .line 85
    invoke-virtual {p1}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->b()Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    if-eqz p1, :cond_2

    .line 90
    .line 91
    invoke-virtual {p1}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->f()Lsu/happ/proxyutility/dto/RouteSettings;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    if-eqz p1, :cond_2

    .line 96
    .line 97
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/RouteSettings;->s()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    goto :goto_1

    .line 102
    :cond_2
    move-object p1, v9

    .line 103
    :goto_1
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 104
    .line 105
    .line 106
    sget-object p1, Lmr2;->Y:Lmr2;

    .line 107
    .line 108
    iget-object v7, p0, Lip6;->g0:Ljava/lang/String;

    .line 109
    .line 110
    invoke-virtual {v6, p1, v7, v8}, Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;->H(Lmr2;Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    iget-object p0, v6, Landroidx/core/app/ComponentActivity;->X:Lg94;

    .line 114
    .line 115
    invoke-static {p0}, Lys0;->z(Lg94;)Lu84;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    new-instance v5, Lpp6;

    .line 120
    .line 121
    const/4 v10, 0x1

    .line 122
    invoke-direct/range {v5 .. v10}, Lpp6;-><init>(Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;Ljava/lang/String;Ljava/lang/String;Lq51;B)V

    .line 123
    .line 124
    .line 125
    invoke-static {p0, v9, v5, v3}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 126
    .line 127
    .line 128
    return-object v2

    .line 129
    :cond_3
    invoke-static {v1}, Ldh3;->T(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    throw v9

    .line 133
    :pswitch_0
    sget v0, Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;->X0:I

    .line 134
    .line 135
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    iget-object v6, p0, Lip6;->Y:Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;

    .line 143
    .line 144
    iget-object v8, p0, Lip6;->Z:Ljava/lang/String;

    .line 145
    .line 146
    if-nez v0, :cond_4

    .line 147
    .line 148
    new-instance p1, Lzw5;

    .line 149
    .line 150
    const/16 v0, 0x10

    .line 151
    .line 152
    invoke-direct {p1, v0}, Lzw5;-><init>(B)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v6, v8, p1}, Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;->I(Ljava/lang/String;Lgn2;)Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 156
    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_4
    invoke-virtual {v4}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->f()Lsu/happ/proxyutility/dto/RouteSettings;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/RouteSettings;->r()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    if-nez v0, :cond_5

    .line 172
    .line 173
    new-instance v0, Lm40;

    .line 174
    .line 175
    const/16 v4, 0x1a

    .line 176
    .line 177
    invoke-direct {v0, p1, v4}, Lm40;-><init>(Ljava/lang/String;B)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v6, v8, v0}, Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;->I(Ljava/lang/String;Lgn2;)Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 181
    .line 182
    .line 183
    :cond_5
    :goto_2
    new-instance p1, Lzw5;

    .line 184
    .line 185
    const/16 v0, 0x11

    .line 186
    .line 187
    invoke-direct {p1, v0}, Lzw5;-><init>(B)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v6, v8, p1}, Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;->I(Ljava/lang/String;Lgn2;)Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    iget-object v0, v6, Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;->Q0:Ls6;

    .line 195
    .line 196
    const/4 v9, 0x0

    .line 197
    if-eqz v0, :cond_7

    .line 198
    .line 199
    iget-object v0, v0, Ls6;->E0:Lsu/happ/proxyutility/ui/foundation/component/HappTextView;

    .line 200
    .line 201
    if-eqz p1, :cond_6

    .line 202
    .line 203
    invoke-virtual {p1}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->b()Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    if-eqz p1, :cond_6

    .line 208
    .line 209
    invoke-virtual {p1}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->f()Lsu/happ/proxyutility/dto/RouteSettings;

    .line 210
    .line 211
    .line 212
    move-result-object p1

    .line 213
    if-eqz p1, :cond_6

    .line 214
    .line 215
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/RouteSettings;->r()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    goto :goto_3

    .line 220
    :cond_6
    move-object p1, v9

    .line 221
    :goto_3
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 222
    .line 223
    .line 224
    sget-object p1, Lmr2;->Z:Lmr2;

    .line 225
    .line 226
    iget-object v7, p0, Lip6;->g0:Ljava/lang/String;

    .line 227
    .line 228
    invoke-virtual {v6, p1, v7, v8}, Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;->H(Lmr2;Ljava/lang/String;Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    iget-object p0, v6, Landroidx/core/app/ComponentActivity;->X:Lg94;

    .line 232
    .line 233
    invoke-static {p0}, Lys0;->z(Lg94;)Lu84;

    .line 234
    .line 235
    .line 236
    move-result-object p0

    .line 237
    new-instance v5, Lpp6;

    .line 238
    .line 239
    const/4 v10, 0x0

    .line 240
    invoke-direct/range {v5 .. v10}, Lpp6;-><init>(Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;Ljava/lang/String;Ljava/lang/String;Lq51;B)V

    .line 241
    .line 242
    .line 243
    invoke-static {p0, v9, v5, v3}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 244
    .line 245
    .line 246
    return-object v2

    .line 247
    :cond_7
    invoke-static {v1}, Ldh3;->T(Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    throw v9

    .line 251
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
