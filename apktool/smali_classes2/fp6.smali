.class public final synthetic Lfp6;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;

.field public final synthetic Z:Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;


# direct methods
.method public synthetic constructor <init>(Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Lfp6;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lfp6;->Y:Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;

    .line 4
    .line 5
    iput-object p2, p0, Lfp6;->Z:Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, Lfp6;->X:B

    .line 4
    .line 5
    const-string v2, "InputCustomDialog"

    .line 6
    .line 7
    const/4 v3, 0x3

    .line 8
    const/4 v4, 0x0

    .line 9
    iget-object v5, v0, Lfp6;->Y:Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;

    .line 10
    .line 11
    iget-object v6, v0, Lfp6;->Z:Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 12
    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    sget v0, Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;->X0:I

    .line 17
    .line 18
    invoke-virtual {v6}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->d()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    new-instance v1, Lzw5;

    .line 23
    .line 24
    const/16 v2, 0xd

    .line 25
    .line 26
    invoke-direct {v1, v2}, Lzw5;-><init>(B)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v5, v0, v1}, Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;->I(Ljava/lang/String;Lgn2;)Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v6}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->c()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v6}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->d()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    sget-object v2, Lmr2;->Z:Lmr2;

    .line 41
    .line 42
    invoke-virtual {v5, v2, v0, v1}, Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;->H(Lmr2;Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    iget-object v0, v5, Landroidx/core/app/ComponentActivity;->X:Lg94;

    .line 46
    .line 47
    invoke-static {v0}, Lys0;->z(Lg94;)Lu84;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    new-instance v1, Lop6;

    .line 52
    .line 53
    const/4 v2, 0x4

    .line 54
    invoke-direct {v1, v5, v6, v4, v2}, Lop6;-><init>(Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;Lq51;B)V

    .line 55
    .line 56
    .line 57
    invoke-static {v0, v4, v1, v3}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :pswitch_0
    iget-object v8, v0, Lfp6;->Y:Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;

    .line 62
    .line 63
    iget-boolean v0, v8, Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;->T0:Z

    .line 64
    .line 65
    if-eqz v0, :cond_0

    .line 66
    .line 67
    sget v0, Ly46;->routing_profile_json_restrict_geo_edit:I

    .line 68
    .line 69
    invoke-static {v8, v0}, Lpu;->O(Lsu/happ/proxyutility/ui/SnackbarHostActivity;I)V

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_0
    invoke-virtual {v6}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->c()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v11

    .line 77
    invoke-virtual {v6}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->d()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v9

    .line 81
    invoke-virtual {v8}, Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;->C()Lmn6;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-virtual {v0, v11, v9}, Lmn6;->n(Ljava/lang/String;Ljava/lang/String;)Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    if-nez v0, :cond_1

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_1
    invoke-virtual {v0}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->b()Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 93
    .line 94
    .line 95
    move-result-object v10

    .line 96
    invoke-virtual {v10}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->f()Lsu/happ/proxyutility/dto/RouteSettings;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/RouteSettings;->s()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    new-instance v7, Lip6;

    .line 105
    .line 106
    const/4 v12, 0x1

    .line 107
    invoke-direct/range {v7 .. v12}, Lip6;-><init>(Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;Ljava/lang/String;Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;Ljava/lang/String;B)V

    .line 108
    .line 109
    .line 110
    new-instance v1, Lsd3;

    .line 111
    .line 112
    sget-object v3, Lod3;->Y:Lod3;

    .line 113
    .line 114
    invoke-direct {v1, v3, v0, v7}, Lsd3;-><init>(Lod3;Ljava/lang/String;Lgn2;)V

    .line 115
    .line 116
    .line 117
    invoke-static {v8, v1, v2}, Ld8;->a0(Lsu/happ/proxyutility/ui/BaseActivity;Lsn1;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    :goto_0
    return-void

    .line 121
    :pswitch_1
    iget-object v10, v0, Lfp6;->Y:Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;

    .line 122
    .line 123
    iget-boolean v0, v10, Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;->T0:Z

    .line 124
    .line 125
    if-eqz v0, :cond_2

    .line 126
    .line 127
    sget v0, Ly46;->routing_profile_json_restrict_geo_edit:I

    .line 128
    .line 129
    invoke-static {v10, v0}, Lpu;->O(Lsu/happ/proxyutility/ui/SnackbarHostActivity;I)V

    .line 130
    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_2
    invoke-virtual {v6}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->c()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v13

    .line 137
    invoke-virtual {v6}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->d()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v11

    .line 141
    invoke-virtual {v10}, Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;->C()Lmn6;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    invoke-virtual {v0, v13, v11}, Lmn6;->n(Ljava/lang/String;Ljava/lang/String;)Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    if-nez v0, :cond_3

    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_3
    invoke-virtual {v0}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->b()Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 153
    .line 154
    .line 155
    move-result-object v12

    .line 156
    invoke-virtual {v12}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->f()Lsu/happ/proxyutility/dto/RouteSettings;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/RouteSettings;->r()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    new-instance v9, Lip6;

    .line 165
    .line 166
    const/4 v14, 0x0

    .line 167
    invoke-direct/range {v9 .. v14}, Lip6;-><init>(Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;Ljava/lang/String;Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;Ljava/lang/String;B)V

    .line 168
    .line 169
    .line 170
    new-instance v1, Lsd3;

    .line 171
    .line 172
    sget-object v3, Lod3;->X:Lod3;

    .line 173
    .line 174
    invoke-direct {v1, v3, v0, v9}, Lsd3;-><init>(Lod3;Ljava/lang/String;Lgn2;)V

    .line 175
    .line 176
    .line 177
    invoke-static {v10, v1, v2}, Ld8;->a0(Lsu/happ/proxyutility/ui/BaseActivity;Lsn1;Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    :goto_1
    return-void

    .line 181
    :pswitch_2
    sget v1, Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;->X0:I

    .line 182
    .line 183
    sget v1, Ly46;->warning_text:I

    .line 184
    .line 185
    iget-object v7, v0, Lfp6;->Y:Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;

    .line 186
    .line 187
    invoke-virtual {v7, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v8

    .line 191
    sget v0, Ly46;->routing_settings_delete_button_warning:I

    .line 192
    .line 193
    invoke-virtual {v7, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v9

    .line 197
    sget v0, Ly46;->yes:I

    .line 198
    .line 199
    invoke-virtual {v7, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v11

    .line 203
    sget v0, Ly46;->no:I

    .line 204
    .line 205
    invoke-virtual {v7, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v12

    .line 209
    new-instance v14, La23;

    .line 210
    .line 211
    const/16 v0, 0x10

    .line 212
    .line 213
    invoke-direct {v14, v6, v7, v0}, La23;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 214
    .line 215
    .line 216
    const/4 v15, 0x0

    .line 217
    const/16 v16, 0x492

    .line 218
    .line 219
    const/4 v10, 0x0

    .line 220
    const/4 v13, 0x0

    .line 221
    invoke-static/range {v7 .. v16}, Lbe;->m(Lsu/happ/proxyutility/ui/BaseActivity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ldn2;Ldn2;I)V

    .line 222
    .line 223
    .line 224
    return-void

    .line 225
    :pswitch_3
    sget v0, Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;->X0:I

    .line 226
    .line 227
    invoke-virtual {v6}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->d()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    new-instance v1, Lzw5;

    .line 232
    .line 233
    const/16 v2, 0xc

    .line 234
    .line 235
    invoke-direct {v1, v2}, Lzw5;-><init>(B)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v5, v0, v1}, Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;->I(Ljava/lang/String;Lgn2;)Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v6}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->c()Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    invoke-virtual {v6}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->d()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v1

    .line 249
    sget-object v2, Lmr2;->Y:Lmr2;

    .line 250
    .line 251
    invoke-virtual {v5, v2, v0, v1}, Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;->H(Lmr2;Ljava/lang/String;Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    iget-object v0, v5, Landroidx/core/app/ComponentActivity;->X:Lg94;

    .line 255
    .line 256
    invoke-static {v0}, Lys0;->z(Lg94;)Lu84;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    new-instance v1, Lop6;

    .line 261
    .line 262
    const/4 v2, 0x5

    .line 263
    invoke-direct {v1, v5, v6, v4, v2}, Lop6;-><init>(Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;Lq51;B)V

    .line 264
    .line 265
    .line 266
    invoke-static {v0, v4, v1, v3}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 267
    .line 268
    .line 269
    return-void

    .line 270
    nop

    .line 271
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
