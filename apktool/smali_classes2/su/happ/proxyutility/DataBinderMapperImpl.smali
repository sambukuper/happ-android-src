.class public Lsu/happ/proxyutility/DataBinderMapperImpl;
.super Lw91;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Landroid/util/SparseIntArray;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Landroid/util/SparseIntArray;

    .line 2
    .line 3
    const/16 v1, 0xb

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/util/SparseIntArray;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lsu/happ/proxyutility/DataBinderMapperImpl;->a:Landroid/util/SparseIntArray;

    .line 9
    .line 10
    sget v2, Lt46;->activity_excluded_routes:I

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    .line 14
    .line 15
    .line 16
    sget v2, Lt46;->activity_inbound_auth:I

    .line 17
    .line 18
    const/4 v3, 0x2

    .line 19
    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    .line 20
    .line 21
    .line 22
    sget v2, Lt46;->activity_report:I

    .line 23
    .line 24
    const/4 v3, 0x3

    .line 25
    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    .line 26
    .line 27
    .line 28
    sget v2, Lt46;->activity_reset_settings:I

    .line 29
    .line 30
    const/4 v3, 0x4

    .line 31
    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    .line 32
    .line 33
    .line 34
    sget v2, Lt46;->activity_vpn_settings:I

    .line 35
    .line 36
    const/4 v3, 0x5

    .line 37
    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    .line 38
    .line 39
    .line 40
    sget v2, Lt46;->fragment_dialog_stories:I

    .line 41
    .line 42
    const/4 v3, 0x6

    .line 43
    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    .line 44
    .line 45
    .line 46
    sget v2, Lt46;->fragment_dialog_subscription_sync:I

    .line 47
    .line 48
    const/4 v3, 0x7

    .line 49
    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    .line 50
    .line 51
    .line 52
    sget v2, Lt46;->fragment_story_page:I

    .line 53
    .line 54
    const/16 v3, 0x8

    .line 55
    .line 56
    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    .line 57
    .line 58
    .line 59
    sget v2, Lt46;->item_network_filter_warning:I

    .line 60
    .line 61
    const/16 v3, 0x9

    .line 62
    .line 63
    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    .line 64
    .line 65
    .line 66
    sget v2, Lt46;->item_server_spacer:I

    .line 67
    .line 68
    const/16 v3, 0xa

    .line 69
    .line 70
    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    .line 71
    .line 72
    .line 73
    sget v2, Lt46;->item_subscription_spacer:I

    .line 74
    .line 75
    invoke-virtual {v0, v2, v1}, Landroid/util/SparseIntArray;->put(II)V

    .line 76
    .line 77
    .line 78
    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 1

    .line 1
    new-instance p0, Ljava/util/ArrayList;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    invoke-direct {p0, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, Landroidx/databinding/library/baseAdapters/DataBinderMapperImpl;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public final b(Landroid/view/View;I)Lkw8;
    .locals 17

    .line 1
    move-object/from16 v2, p1

    .line 2
    .line 3
    sget-object v0, Lsu/happ/proxyutility/DataBinderMapperImpl;->a:Landroid/util/SparseIntArray;

    .line 4
    .line 5
    move/from16 v1, p2

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/util/SparseIntArray;->get(I)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v8, 0x0

    .line 12
    if-lez v0, :cond_d

    .line 13
    .line 14
    invoke-virtual {v2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    if-eqz v1, :cond_c

    .line 19
    .line 20
    const-wide/16 v9, 0x1

    .line 21
    .line 22
    const-wide/16 v11, -0x1

    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    const/4 v4, 0x4

    .line 26
    const/4 v5, 0x5

    .line 27
    const/4 v6, 0x1

    .line 28
    const/4 v7, 0x3

    .line 29
    const/4 v13, 0x2

    .line 30
    const/4 v14, 0x6

    .line 31
    packed-switch v0, :pswitch_data_0

    .line 32
    .line 33
    .line 34
    goto/16 :goto_0

    .line 35
    .line 36
    :pswitch_0
    const-string v0, "layout/item_subscription_spacer_0"

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_0

    .line 43
    .line 44
    new-instance v4, Lti3;

    .line 45
    .line 46
    invoke-static {v2, v6, v8}, Lkw8;->e(Landroid/view/View;ILandroid/util/SparseIntArray;)[Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-direct {v4, v2, v8}, Lkw8;-><init>(Landroid/view/View;Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iput-wide v11, v4, Lti3;->m0:J

    .line 54
    .line 55
    aget-object v0, v0, v3

    .line 56
    .line 57
    check-cast v0, Landroid/view/View;

    .line 58
    .line 59
    invoke-virtual {v0, v8}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v4, v2}, Lkw8;->g(Landroid/view/View;)V

    .line 63
    .line 64
    .line 65
    monitor-enter v4

    .line 66
    :try_start_0
    iput-wide v9, v4, Lti3;->m0:J

    .line 67
    .line 68
    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    invoke-virtual {v4}, Lkw8;->f()V

    .line 70
    .line 71
    .line 72
    return-object v4

    .line 73
    :catchall_0
    move-exception v0

    .line 74
    :try_start_1
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 75
    throw v0

    .line 76
    :cond_0
    const-string v0, "The tag for item_subscription_spacer is invalid. Received: "

    .line 77
    .line 78
    invoke-static {v1, v0}, Loi0;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-static {v0}, Lbt;->q(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    return-object v8

    .line 86
    :pswitch_1
    const-string v0, "layout/item_server_spacer_0"

    .line 87
    .line 88
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-eqz v0, :cond_1

    .line 93
    .line 94
    new-instance v4, Lri3;

    .line 95
    .line 96
    invoke-static {v2, v6, v8}, Lkw8;->e(Landroid/view/View;ILandroid/util/SparseIntArray;)[Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-direct {v4, v2, v8}, Lkw8;-><init>(Landroid/view/View;Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    iput-wide v11, v4, Lri3;->m0:J

    .line 104
    .line 105
    aget-object v0, v0, v3

    .line 106
    .line 107
    check-cast v0, Landroid/view/View;

    .line 108
    .line 109
    invoke-virtual {v0, v8}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v4, v2}, Lkw8;->g(Landroid/view/View;)V

    .line 113
    .line 114
    .line 115
    monitor-enter v4

    .line 116
    :try_start_2
    iput-wide v9, v4, Lri3;->m0:J

    .line 117
    .line 118
    monitor-exit v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 119
    invoke-virtual {v4}, Lkw8;->f()V

    .line 120
    .line 121
    .line 122
    return-object v4

    .line 123
    :catchall_1
    move-exception v0

    .line 124
    :try_start_3
    monitor-exit v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 125
    throw v0

    .line 126
    :cond_1
    const-string v0, "The tag for item_server_spacer is invalid. Received: "

    .line 127
    .line 128
    invoke-static {v1, v0}, Loi0;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-static {v0}, Lbt;->q(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    return-object v8

    .line 136
    :pswitch_2
    const-string v0, "layout/item_network_filter_warning_0"

    .line 137
    .line 138
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    if-eqz v0, :cond_2

    .line 143
    .line 144
    new-instance v15, Lpi3;

    .line 145
    .line 146
    sget-object v0, Lpi3;->q0:Landroid/util/SparseIntArray;

    .line 147
    .line 148
    invoke-static {v2, v14, v0}, Lkw8;->e(Landroid/view/View;ILandroid/util/SparseIntArray;)[Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    aget-object v1, v0, v13

    .line 153
    .line 154
    check-cast v1, Landroid/view/View;

    .line 155
    .line 156
    aget-object v1, v0, v7

    .line 157
    .line 158
    check-cast v1, Landroidx/appcompat/widget/AppCompatImageView;

    .line 159
    .line 160
    aget-object v1, v0, v6

    .line 161
    .line 162
    check-cast v1, Landroid/widget/LinearLayout;

    .line 163
    .line 164
    aget-object v1, v0, v5

    .line 165
    .line 166
    check-cast v1, Lsu/happ/proxyutility/ui/foundation/component/HappTextView;

    .line 167
    .line 168
    aget-object v1, v0, v4

    .line 169
    .line 170
    check-cast v1, Lsu/happ/proxyutility/ui/foundation/component/HappTextView;

    .line 171
    .line 172
    aget-object v0, v0, v3

    .line 173
    .line 174
    check-cast v0, Lcom/tistory/zladnrms/roundablelayout/RoundableLayout;

    .line 175
    .line 176
    invoke-direct {v15, v2, v1, v0}, Loi3;-><init>(Landroid/view/View;Lsu/happ/proxyutility/ui/foundation/component/HappTextView;Lcom/tistory/zladnrms/roundablelayout/RoundableLayout;)V

    .line 177
    .line 178
    .line 179
    iput-wide v11, v15, Lpi3;->p0:J

    .line 180
    .line 181
    iget-object v0, v15, Loi3;->n0:Lcom/tistory/zladnrms/roundablelayout/RoundableLayout;

    .line 182
    .line 183
    invoke-virtual {v0, v8}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    sget v0, Lm46;->dataBinding:I

    .line 187
    .line 188
    invoke-virtual {v2, v0, v15}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    monitor-enter v15

    .line 192
    :try_start_4
    iput-wide v9, v15, Lpi3;->p0:J

    .line 193
    .line 194
    monitor-exit v15
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 195
    invoke-virtual {v15}, Lkw8;->f()V

    .line 196
    .line 197
    .line 198
    return-object v15

    .line 199
    :catchall_2
    move-exception v0

    .line 200
    :try_start_5
    monitor-exit v15
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 201
    throw v0

    .line 202
    :cond_2
    const-string v0, "The tag for item_network_filter_warning is invalid. Received: "

    .line 203
    .line 204
    invoke-static {v1, v0}, Loi0;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    invoke-static {v0}, Lbt;->q(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    return-object v8

    .line 212
    :pswitch_3
    const-string v0, "layout/fragment_story_page_0"

    .line 213
    .line 214
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result v0

    .line 218
    if-eqz v0, :cond_3

    .line 219
    .line 220
    new-instance v1, Lyl2;

    .line 221
    .line 222
    const/4 v0, 0x7

    .line 223
    sget-object v15, Lyl2;->t0:Landroid/util/SparseIntArray;

    .line 224
    .line 225
    invoke-static {v2, v0, v15}, Lkw8;->e(Landroid/view/View;ILandroid/util/SparseIntArray;)[Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    aget-object v7, v0, v7

    .line 230
    .line 231
    check-cast v7, Landroid/widget/LinearLayout;

    .line 232
    .line 233
    aget-object v5, v0, v5

    .line 234
    .line 235
    check-cast v5, Landroid/widget/ScrollView;

    .line 236
    .line 237
    aget-object v5, v0, v6

    .line 238
    .line 239
    check-cast v5, Landroidx/appcompat/widget/AppCompatImageView;

    .line 240
    .line 241
    aget-object v3, v0, v3

    .line 242
    .line 243
    check-cast v3, Landroid/widget/RelativeLayout;

    .line 244
    .line 245
    aget-object v6, v0, v14

    .line 246
    .line 247
    check-cast v6, Landroid/widget/TextSwitcher;

    .line 248
    .line 249
    aget-object v4, v0, v4

    .line 250
    .line 251
    check-cast v4, Landroid/widget/TextSwitcher;

    .line 252
    .line 253
    aget-object v0, v0, v13

    .line 254
    .line 255
    check-cast v0, Landroid/view/View;

    .line 256
    .line 257
    move-object/from16 v16, v5

    .line 258
    .line 259
    move-object v5, v3

    .line 260
    move-object v3, v7

    .line 261
    move-object v7, v4

    .line 262
    move-object/from16 v4, v16

    .line 263
    .line 264
    invoke-direct/range {v1 .. v7}, Lxl2;-><init>(Landroid/view/View;Landroid/widget/LinearLayout;Landroidx/appcompat/widget/AppCompatImageView;Landroid/widget/RelativeLayout;Landroid/widget/TextSwitcher;Landroid/widget/TextSwitcher;)V

    .line 265
    .line 266
    .line 267
    move-object v3, v1

    .line 268
    iput-wide v11, v3, Lyl2;->s0:J

    .line 269
    .line 270
    iget-object v0, v3, Lxl2;->o0:Landroid/widget/RelativeLayout;

    .line 271
    .line 272
    invoke-virtual {v0, v8}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 273
    .line 274
    .line 275
    sget v0, Lm46;->dataBinding:I

    .line 276
    .line 277
    invoke-virtual {v2, v0, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 278
    .line 279
    .line 280
    monitor-enter v3

    .line 281
    :try_start_6
    iput-wide v9, v3, Lyl2;->s0:J

    .line 282
    .line 283
    monitor-exit v3
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 284
    invoke-virtual {v3}, Lkw8;->f()V

    .line 285
    .line 286
    .line 287
    return-object v3

    .line 288
    :catchall_3
    move-exception v0

    .line 289
    :try_start_7
    monitor-exit v3
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 290
    throw v0

    .line 291
    :cond_3
    const-string v0, "The tag for fragment_story_page is invalid. Received: "

    .line 292
    .line 293
    invoke-static {v1, v0}, Loi0;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    invoke-static {v0}, Lbt;->q(Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    return-object v8

    .line 301
    :pswitch_4
    const-string v0, "layout/fragment_dialog_subscription_sync_0"

    .line 302
    .line 303
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 304
    .line 305
    .line 306
    move-result v0

    .line 307
    if-eqz v0, :cond_4

    .line 308
    .line 309
    new-instance v0, Lzk2;

    .line 310
    .line 311
    invoke-direct {v0, v2}, Lzk2;-><init>(Landroid/view/View;)V

    .line 312
    .line 313
    .line 314
    return-object v0

    .line 315
    :cond_4
    const-string v0, "The tag for fragment_dialog_subscription_sync is invalid. Received: "

    .line 316
    .line 317
    invoke-static {v1, v0}, Loi0;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    invoke-static {v0}, Lbt;->q(Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    return-object v8

    .line 325
    :pswitch_5
    const-string v0, "layout/fragment_dialog_stories_0"

    .line 326
    .line 327
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 328
    .line 329
    .line 330
    move-result v0

    .line 331
    if-eqz v0, :cond_5

    .line 332
    .line 333
    new-instance v0, Lxk2;

    .line 334
    .line 335
    invoke-direct {v0, v2}, Lxk2;-><init>(Landroid/view/View;)V

    .line 336
    .line 337
    .line 338
    return-object v0

    .line 339
    :cond_5
    const-string v0, "The tag for fragment_dialog_stories is invalid. Received: "

    .line 340
    .line 341
    invoke-static {v1, v0}, Loi0;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    invoke-static {v0}, Lbt;->q(Ljava/lang/String;)V

    .line 346
    .line 347
    .line 348
    return-object v8

    .line 349
    :pswitch_6
    const-string v0, "layout/activity_vpn_settings_0"

    .line 350
    .line 351
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 352
    .line 353
    .line 354
    move-result v0

    .line 355
    if-eqz v0, :cond_6

    .line 356
    .line 357
    new-instance v0, Lx6;

    .line 358
    .line 359
    invoke-direct {v0, v2}, Lx6;-><init>(Landroid/view/View;)V

    .line 360
    .line 361
    .line 362
    return-object v0

    .line 363
    :cond_6
    const-string v0, "The tag for activity_vpn_settings is invalid. Received: "

    .line 364
    .line 365
    invoke-static {v1, v0}, Loi0;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object v0

    .line 369
    invoke-static {v0}, Lbt;->q(Ljava/lang/String;)V

    .line 370
    .line 371
    .line 372
    return-object v8

    .line 373
    :pswitch_7
    const-string v0, "layout/activity_reset_settings_0"

    .line 374
    .line 375
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 376
    .line 377
    .line 378
    move-result v0

    .line 379
    if-eqz v0, :cond_7

    .line 380
    .line 381
    new-instance v0, Lh6;

    .line 382
    .line 383
    invoke-direct {v0, v2}, Lh6;-><init>(Landroid/view/View;)V

    .line 384
    .line 385
    .line 386
    return-object v0

    .line 387
    :cond_7
    const-string v0, "The tag for activity_reset_settings is invalid. Received: "

    .line 388
    .line 389
    invoke-static {v1, v0}, Loi0;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 390
    .line 391
    .line 392
    move-result-object v0

    .line 393
    invoke-static {v0}, Lbt;->q(Ljava/lang/String;)V

    .line 394
    .line 395
    .line 396
    return-object v8

    .line 397
    :pswitch_8
    const-string v0, "layout/activity_report_0"

    .line 398
    .line 399
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 400
    .line 401
    .line 402
    move-result v0

    .line 403
    if-eqz v0, :cond_8

    .line 404
    .line 405
    new-instance v0, Lg6;

    .line 406
    .line 407
    invoke-direct {v0, v2}, Lg6;-><init>(Landroid/view/View;)V

    .line 408
    .line 409
    .line 410
    return-object v0

    .line 411
    :cond_8
    const-string v0, "The tag for activity_report is invalid. Received: "

    .line 412
    .line 413
    invoke-static {v1, v0}, Loi0;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 414
    .line 415
    .line 416
    move-result-object v0

    .line 417
    invoke-static {v0}, Lbt;->q(Ljava/lang/String;)V

    .line 418
    .line 419
    .line 420
    return-object v8

    .line 421
    :pswitch_9
    const-string v0, "layout/activity_inbound_auth_0"

    .line 422
    .line 423
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 424
    .line 425
    .line 426
    move-result v0

    .line 427
    if-eqz v0, :cond_9

    .line 428
    .line 429
    new-instance v0, La6;

    .line 430
    .line 431
    invoke-direct {v0, v2}, La6;-><init>(Landroid/view/View;)V

    .line 432
    .line 433
    .line 434
    return-object v0

    .line 435
    :cond_9
    const-string v0, "The tag for activity_inbound_auth is invalid. Received: "

    .line 436
    .line 437
    invoke-static {v1, v0}, Loi0;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 438
    .line 439
    .line 440
    move-result-object v0

    .line 441
    invoke-static {v0}, Lbt;->q(Ljava/lang/String;)V

    .line 442
    .line 443
    .line 444
    return-object v8

    .line 445
    :pswitch_a
    const-string v0, "layout-television/activity_excluded_routes_0"

    .line 446
    .line 447
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 448
    .line 449
    .line 450
    move-result v0

    .line 451
    if-eqz v0, :cond_a

    .line 452
    .line 453
    new-instance v0, Lx5;

    .line 454
    .line 455
    invoke-direct {v0, v2}, Lx5;-><init>(Landroid/view/View;)V

    .line 456
    .line 457
    .line 458
    return-object v0

    .line 459
    :cond_a
    const-string v0, "layout/activity_excluded_routes_0"

    .line 460
    .line 461
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 462
    .line 463
    .line 464
    move-result v0

    .line 465
    if-eqz v0, :cond_b

    .line 466
    .line 467
    new-instance v0, Lw5;

    .line 468
    .line 469
    invoke-direct {v0, v2}, Lw5;-><init>(Landroid/view/View;)V

    .line 470
    .line 471
    .line 472
    return-object v0

    .line 473
    :cond_b
    const-string v0, "The tag for activity_excluded_routes is invalid. Received: "

    .line 474
    .line 475
    invoke-static {v1, v0}, Loi0;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 476
    .line 477
    .line 478
    move-result-object v0

    .line 479
    invoke-static {v0}, Lbt;->q(Ljava/lang/String;)V

    .line 480
    .line 481
    .line 482
    return-object v8

    .line 483
    :cond_c
    const-string v0, "view must have a tag"

    .line 484
    .line 485
    invoke-static {v0}, Lkp5;->t(Ljava/lang/String;)V

    .line 486
    .line 487
    .line 488
    :cond_d
    :goto_0
    return-object v8

    .line 489
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final c([Landroid/view/View;I)Lkw8;
    .locals 1

    .line 1
    array-length p0, p1

    .line 2
    const/4 v0, 0x0

    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    sget-object p0, Lsu/happ/proxyutility/DataBinderMapperImpl;->a:Landroid/util/SparseIntArray;

    .line 7
    .line 8
    invoke-virtual {p0, p2}, Landroid/util/SparseIntArray;->get(I)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    if-lez p0, :cond_2

    .line 13
    .line 14
    const/4 p0, 0x0

    .line 15
    aget-object p0, p1, p0

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    if-eqz p0, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    const-string p0, "view must have a tag"

    .line 25
    .line 26
    invoke-static {p0}, Lkp5;->t(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    :cond_2
    :goto_0
    return-object v0
.end method
