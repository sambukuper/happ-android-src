.class public final Lsu/happ/proxyutility/feature/settings/OtherSettingsFragment;
.super Lqk2;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lsu/happ/proxyutility/feature/settings/OtherSettingsFragment;",
        "Lqk2;",
        "<init>",
        "()V",
        "app"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final d1:Lvz7;

.field public e1:Lrl2;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lqk2;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ldw4;

    .line 5
    .line 6
    const/16 v1, 0xe

    .line 7
    .line 8
    invoke-direct {v0, v1}, Ldw4;-><init>(B)V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lvz7;

    .line 12
    .line 13
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Lsu/happ/proxyutility/feature/settings/OtherSettingsFragment;->d1:Lvz7;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final R()Lrl2;
    .locals 0

    .line 1
    iget-object p0, p0, Lsu/happ/proxyutility/feature/settings/OtherSettingsFragment;->e1:Lrl2;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "binding"

    .line 7
    .line 8
    invoke-static {p0}, Ldh3;->T(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method

.method public final z(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 12

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget v0, Lt46;->fragment_other_settings:I

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    sget p2, Le46;->check_update_progress_bar:I

    .line 12
    .line 13
    invoke-static {p1, p2}, Lln7;->b(Landroid/view/View;I)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    move-object v4, v0

    .line 18
    check-cast v4, Landroid/widget/ProgressBar;

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    if-eqz v4, :cond_0

    .line 22
    .line 23
    sget p2, Le46;->check_update_text:I

    .line 24
    .line 25
    invoke-static {p1, p2}, Lln7;->b(Landroid/view/View;I)Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    check-cast v2, Lsu/happ/proxyutility/ui/foundation/component/HappTextView;

    .line 30
    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    sget p2, Le46;->divider_beta_version_enabled:I

    .line 34
    .line 35
    invoke-static {p1, p2}, Lln7;->b(Landroid/view/View;I)Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    move-object v5, v2

    .line 40
    check-cast v5, Lsu/happ/proxyutility/ui/foundation/component/HappSettingsDivider;

    .line 41
    .line 42
    if-eqz v5, :cond_0

    .line 43
    .line 44
    sget p2, Le46;->divider_check_update:I

    .line 45
    .line 46
    invoke-static {p1, p2}, Lln7;->b(Landroid/view/View;I)Landroid/view/View;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    move-object v6, v2

    .line 51
    check-cast v6, Lsu/happ/proxyutility/ui/foundation/component/HappSettingsDivider;

    .line 52
    .line 53
    if-eqz v6, :cond_0

    .line 54
    .line 55
    sget p2, Le46;->divider_logs:I

    .line 56
    .line 57
    invoke-static {p1, p2}, Lln7;->b(Landroid/view/View;I)Landroid/view/View;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    check-cast v2, Lsu/happ/proxyutility/ui/foundation/component/HappSettingsDivider;

    .line 62
    .line 63
    if-eqz v2, :cond_0

    .line 64
    .line 65
    sget p2, Le46;->divider_statistic:I

    .line 66
    .line 67
    invoke-static {p1, p2}, Lln7;->b(Landroid/view/View;I)Landroid/view/View;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    check-cast v2, Lsu/happ/proxyutility/ui/foundation/component/HappSettingsDivider;

    .line 72
    .line 73
    if-eqz v2, :cond_0

    .line 74
    .line 75
    sget p2, Le46;->forward_logs:I

    .line 76
    .line 77
    invoke-static {p1, p2}, Lln7;->b(Landroid/view/View;I)Landroid/view/View;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    move-object v7, v2

    .line 82
    check-cast v7, Lsu/happ/proxyutility/ui/foundation/component/HappForwardField;

    .line 83
    .line 84
    if-eqz v7, :cond_0

    .line 85
    .line 86
    sget p2, Le46;->forward_reset:I

    .line 87
    .line 88
    invoke-static {p1, p2}, Lln7;->b(Landroid/view/View;I)Landroid/view/View;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    move-object v8, v2

    .line 93
    check-cast v8, Lsu/happ/proxyutility/ui/foundation/component/HappForwardField;

    .line 94
    .line 95
    if-eqz v8, :cond_0

    .line 96
    .line 97
    sget p2, Le46;->forward_statistic:I

    .line 98
    .line 99
    invoke-static {p1, p2}, Lln7;->b(Landroid/view/View;I)Landroid/view/View;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    move-object v9, v2

    .line 104
    check-cast v9, Lsu/happ/proxyutility/ui/foundation/component/HappForwardField;

    .line 105
    .line 106
    if-eqz v9, :cond_0

    .line 107
    .line 108
    sget p2, Le46;->ll_check_update:I

    .line 109
    .line 110
    invoke-static {p1, p2}, Lln7;->b(Landroid/view/View;I)Landroid/view/View;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    move-object v10, v2

    .line 115
    check-cast v10, Landroid/widget/LinearLayout;

    .line 116
    .line 117
    if-eqz v10, :cond_0

    .line 118
    .line 119
    sget p2, Le46;->title_category:I

    .line 120
    .line 121
    invoke-static {p1, p2}, Lln7;->b(Landroid/view/View;I)Landroid/view/View;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    check-cast v2, Lsu/happ/proxyutility/ui/foundation/component/HappSettingsTitle;

    .line 126
    .line 127
    if-eqz v2, :cond_0

    .line 128
    .line 129
    sget p2, Le46;->toggle_beta_version_enabled:I

    .line 130
    .line 131
    invoke-static {p1, p2}, Lln7;->b(Landroid/view/View;I)Landroid/view/View;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    move-object v11, v2

    .line 136
    check-cast v11, Lsu/happ/proxyutility/ui/foundation/component/HappToggleField;

    .line 137
    .line 138
    if-eqz v11, :cond_0

    .line 139
    .line 140
    new-instance v2, Lrl2;

    .line 141
    .line 142
    move-object v3, p1

    .line 143
    check-cast v3, Landroid/widget/LinearLayout;

    .line 144
    .line 145
    invoke-direct/range {v2 .. v11}, Lrl2;-><init>(Landroid/widget/LinearLayout;Landroid/widget/ProgressBar;Lsu/happ/proxyutility/ui/foundation/component/HappSettingsDivider;Lsu/happ/proxyutility/ui/foundation/component/HappSettingsDivider;Lsu/happ/proxyutility/ui/foundation/component/HappForwardField;Lsu/happ/proxyutility/ui/foundation/component/HappForwardField;Lsu/happ/proxyutility/ui/foundation/component/HappForwardField;Landroid/widget/LinearLayout;Lsu/happ/proxyutility/ui/foundation/component/HappToggleField;)V

    .line 146
    .line 147
    .line 148
    iput-object v2, p0, Lsu/happ/proxyutility/feature/settings/OtherSettingsFragment;->e1:Lrl2;

    .line 149
    .line 150
    invoke-virtual {p0}, Lsu/happ/proxyutility/feature/settings/OtherSettingsFragment;->R()Lrl2;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    iget-object p1, p1, Lrl2;->k0:Lsu/happ/proxyutility/ui/foundation/component/HappToggleField;

    .line 155
    .line 156
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {p0}, Lsu/happ/proxyutility/feature/settings/OtherSettingsFragment;->R()Lrl2;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    iget-object p1, p1, Lrl2;->Z:Lsu/happ/proxyutility/ui/foundation/component/HappSettingsDivider;

    .line 164
    .line 165
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {p0}, Lsu/happ/proxyutility/feature/settings/OtherSettingsFragment;->R()Lrl2;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    iget-object p1, p1, Lrl2;->j0:Landroid/widget/LinearLayout;

    .line 173
    .line 174
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {p0}, Lsu/happ/proxyutility/feature/settings/OtherSettingsFragment;->R()Lrl2;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    iget-object p1, p1, Lrl2;->f0:Lsu/happ/proxyutility/ui/foundation/component/HappSettingsDivider;

    .line 182
    .line 183
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {p0}, Lsu/happ/proxyutility/feature/settings/OtherSettingsFragment;->R()Lrl2;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    iget-object p1, p1, Lrl2;->k0:Lsu/happ/proxyutility/ui/foundation/component/HappToggleField;

    .line 191
    .line 192
    new-instance p2, Lvj2;

    .line 193
    .line 194
    const/16 v2, 0x16

    .line 195
    .line 196
    invoke-direct {p2, p0, v2}, Lvj2;-><init>(Ljava/lang/Object;B)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {p1, p2}, Lsu/happ/proxyutility/ui/foundation/component/HappToggleField;->setOnToggleClickListener(Lgn2;)V

    .line 200
    .line 201
    .line 202
    iget-object p1, p0, Lsu/happ/proxyutility/feature/settings/OtherSettingsFragment;->d1:Lvz7;

    .line 203
    .line 204
    invoke-virtual {p1}, Lvz7;->getValue()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    check-cast p1, Lcom/tencent/mmkv/MMKV;

    .line 209
    .line 210
    const-string p2, "pref_beta_version"

    .line 211
    .line 212
    invoke-virtual {p1, p2, v1}, Lcom/tencent/mmkv/MMKV;->getBoolean(Ljava/lang/String;Z)Z

    .line 213
    .line 214
    .line 215
    move-result p1

    .line 216
    invoke-virtual {p0}, Lsu/happ/proxyutility/feature/settings/OtherSettingsFragment;->R()Lrl2;

    .line 217
    .line 218
    .line 219
    move-result-object p2

    .line 220
    iget-object p2, p2, Lrl2;->k0:Lsu/happ/proxyutility/ui/foundation/component/HappToggleField;

    .line 221
    .line 222
    invoke-virtual {p2, p1}, Lsu/happ/proxyutility/ui/foundation/component/HappToggleField;->setChecked(Z)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {p0}, Lsu/happ/proxyutility/feature/settings/OtherSettingsFragment;->R()Lrl2;

    .line 226
    .line 227
    .line 228
    move-result-object p1

    .line 229
    iget-object p1, p1, Lrl2;->j0:Landroid/widget/LinearLayout;

    .line 230
    .line 231
    new-instance p2, Lvd5;

    .line 232
    .line 233
    invoke-direct {p2, p0, v1}, Lvd5;-><init>(Lsu/happ/proxyutility/feature/settings/OtherSettingsFragment;B)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {p0}, Lsu/happ/proxyutility/feature/settings/OtherSettingsFragment;->R()Lrl2;

    .line 240
    .line 241
    .line 242
    move-result-object p1

    .line 243
    iget-object p1, p1, Lrl2;->i0:Lsu/happ/proxyutility/ui/foundation/component/HappForwardField;

    .line 244
    .line 245
    new-instance p2, Lvd5;

    .line 246
    .line 247
    const/4 v1, 0x1

    .line 248
    invoke-direct {p2, p0, v1}, Lvd5;-><init>(Lsu/happ/proxyutility/feature/settings/OtherSettingsFragment;B)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {p0}, Lsu/happ/proxyutility/feature/settings/OtherSettingsFragment;->R()Lrl2;

    .line 255
    .line 256
    .line 257
    move-result-object p1

    .line 258
    iget-object p1, p1, Lrl2;->g0:Lsu/happ/proxyutility/ui/foundation/component/HappForwardField;

    .line 259
    .line 260
    new-instance p2, Lvd5;

    .line 261
    .line 262
    const/4 v2, 0x2

    .line 263
    invoke-direct {p2, p0, v2}, Lvd5;-><init>(Lsu/happ/proxyutility/feature/settings/OtherSettingsFragment;B)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {p0}, Lsu/happ/proxyutility/feature/settings/OtherSettingsFragment;->R()Lrl2;

    .line 270
    .line 271
    .line 272
    move-result-object p1

    .line 273
    iget-object p1, p1, Lrl2;->h0:Lsu/happ/proxyutility/ui/foundation/component/HappForwardField;

    .line 274
    .line 275
    new-instance p2, Lvd5;

    .line 276
    .line 277
    const/4 v3, 0x3

    .line 278
    invoke-direct {p2, p0, v3}, Lvd5;-><init>(Lsu/happ/proxyutility/feature/settings/OtherSettingsFragment;B)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 282
    .line 283
    .line 284
    iget-object p1, p0, Lqk2;->S0:Lg94;

    .line 285
    .line 286
    invoke-static {p1}, Lys0;->z(Lg94;)Lu84;

    .line 287
    .line 288
    .line 289
    move-result-object p1

    .line 290
    sget-object p2, Ltp1;->a:Lnf1;

    .line 291
    .line 292
    sget-object p2, Ldm4;->a:Lhv2;

    .line 293
    .line 294
    new-instance v3, Lwd5;

    .line 295
    .line 296
    invoke-direct {v3, p0, v0, v1}, Lwd5;-><init>(Lsu/happ/proxyutility/feature/settings/OtherSettingsFragment;Lq51;B)V

    .line 297
    .line 298
    .line 299
    invoke-static {p1, p2, v3, v2}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 300
    .line 301
    .line 302
    invoke-virtual {p0}, Lsu/happ/proxyutility/feature/settings/OtherSettingsFragment;->R()Lrl2;

    .line 303
    .line 304
    .line 305
    move-result-object p0

    .line 306
    iget-object p0, p0, Lrl2;->X:Landroid/widget/LinearLayout;

    .line 307
    .line 308
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 309
    .line 310
    .line 311
    return-object p0

    .line 312
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 313
    .line 314
    .line 315
    move-result-object p0

    .line 316
    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object p0

    .line 320
    const-string p1, "Missing required view with ID: "

    .line 321
    .line 322
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object p0

    .line 326
    invoke-static {p0}, Lb61;->i(Ljava/lang/String;)V

    .line 327
    .line 328
    .line 329
    return-object v0
.end method
