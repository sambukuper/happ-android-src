.class public final Low4;
.super Lpy0;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public g0:Ldn2;

.field public h0:Lax4;

.field public i0:J

.field public final j0:Landroid/view/View;

.field public final k0:Llw4;


# direct methods
.method public constructor <init>(Ldn2;Lax4;JLandroid/view/View;Lz24;Lfi1;Ljava/util/UUID;Loi;Lb71;)V
    .locals 6

    .line 1
    new-instance v0, Landroid/view/ContextThemeWrapper;

    .line 2
    .line 3
    invoke-virtual {p5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    sget v2, Lk56;->EdgeToEdgeFloatingDialogWindowTheme:I

    .line 8
    .line 9
    invoke-direct {v0, v1, v2}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-direct {p0, v0, v1}, Lpy0;-><init>(Landroid/content/Context;I)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Low4;->g0:Ldn2;

    .line 17
    .line 18
    iput-object p2, p0, Low4;->h0:Lax4;

    .line 19
    .line 20
    iput-wide p3, p0, Low4;->i0:J

    .line 21
    .line 22
    iput-object p5, p0, Low4;->j0:Landroid/view/View;

    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    if-eqz p1, :cond_5

    .line 29
    .line 30
    const/4 p2, 0x1

    .line 31
    invoke-virtual {p1, p2}, Landroid/view/Window;->requestFeature(I)Z

    .line 32
    .line 33
    .line 34
    const p2, 0x106000d

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, p2}, Landroid/view/Window;->setBackgroundDrawableResource(I)V

    .line 38
    .line 39
    .line 40
    invoke-static {p1, v1}, Lxt7;->f(Landroid/view/Window;Z)V

    .line 41
    .line 42
    .line 43
    new-instance p2, Llw4;

    .line 44
    .line 45
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 46
    .line 47
    .line 48
    move-result-object p3

    .line 49
    invoke-direct {p2, p3, p1}, Llw4;-><init>(Landroid/content/Context;Landroid/view/Window;)V

    .line 50
    .line 51
    .line 52
    sget p3, Lg46;->compose_view_saveable_id_tag:I

    .line 53
    .line 54
    new-instance p4, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    const-string v0, "Dialog:"

    .line 57
    .line 58
    invoke-direct {p4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p4, p8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p4

    .line 68
    invoke-virtual {p2, p3, p4}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p2, v1}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 72
    .line 73
    .line 74
    const/high16 p3, 0x41000000    # 8.0f

    .line 75
    .line 76
    invoke-interface {p7, p3}, Lfi1;->h0(F)F

    .line 77
    .line 78
    .line 79
    move-result p3

    .line 80
    invoke-virtual {p2, p3}, Landroid/view/View;->setElevation(F)V

    .line 81
    .line 82
    .line 83
    new-instance p3, Lnu0;

    .line 84
    .line 85
    const/4 p4, 0x2

    .line 86
    invoke-direct {p3, p4}, Lnu0;-><init>(B)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p2, p3}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    .line 90
    .line 91
    .line 92
    iput-object p2, p0, Low4;->k0:Llw4;

    .line 93
    .line 94
    invoke-virtual {p0, p2}, Lpy0;->setContentView(Landroid/view/View;)V

    .line 95
    .line 96
    .line 97
    invoke-static {p5}, Lus7;->b(Landroid/view/View;)Ld94;

    .line 98
    .line 99
    .line 100
    move-result-object p3

    .line 101
    sget p4, Lv36;->view_tree_lifecycle_owner:I

    .line 102
    .line 103
    invoke-virtual {p2, p4, p3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    invoke-static {p5}, Lgs8;->j(Landroid/view/View;)Lfx8;

    .line 107
    .line 108
    .line 109
    move-result-object p3

    .line 110
    sget p4, Lw36;->view_tree_view_model_store_owner:I

    .line 111
    .line 112
    invoke-virtual {p2, p4, p3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    invoke-static {p5}, Lys7;->d(Landroid/view/View;)Lyv6;

    .line 116
    .line 117
    .line 118
    move-result-object p3

    .line 119
    sget p4, Lz36;->view_tree_saved_state_registry_owner:I

    .line 120
    .line 121
    invoke-virtual {p2, p4, p3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    iget-object v1, p0, Low4;->g0:Ldn2;

    .line 125
    .line 126
    iget-object v2, p0, Low4;->h0:Lax4;

    .line 127
    .line 128
    iget-wide v3, p0, Low4;->i0:J

    .line 129
    .line 130
    move-object v0, p0

    .line 131
    move-object v5, p6

    .line 132
    invoke-virtual/range {v0 .. v5}, Low4;->g(Ldn2;Lax4;JLz24;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 136
    .line 137
    .line 138
    move-result-object p2

    .line 139
    new-instance p3, Llr5;

    .line 140
    .line 141
    invoke-direct {p3, p2}, Llr5;-><init>(Landroid/view/View;)V

    .line 142
    .line 143
    .line 144
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 145
    .line 146
    const/16 p4, 0x23

    .line 147
    .line 148
    if-lt p2, p4, :cond_0

    .line 149
    .line 150
    new-instance p2, Lb29;

    .line 151
    .line 152
    invoke-direct {p2, p1, p3}, Lz19;-><init>(Landroid/view/Window;Llr5;)V

    .line 153
    .line 154
    .line 155
    goto :goto_0

    .line 156
    :cond_0
    const/16 p4, 0x1e

    .line 157
    .line 158
    if-lt p2, p4, :cond_1

    .line 159
    .line 160
    new-instance p2, Lz19;

    .line 161
    .line 162
    invoke-direct {p2, p1, p3}, Lz19;-><init>(Landroid/view/Window;Llr5;)V

    .line 163
    .line 164
    .line 165
    goto :goto_0

    .line 166
    :cond_1
    const/16 p4, 0x1a

    .line 167
    .line 168
    if-lt p2, p4, :cond_2

    .line 169
    .line 170
    new-instance p2, Ly19;

    .line 171
    .line 172
    invoke-direct {p2, p1, p3}, Lx19;-><init>(Landroid/view/Window;Llr5;)V

    .line 173
    .line 174
    .line 175
    goto :goto_0

    .line 176
    :cond_2
    new-instance p2, Lx19;

    .line 177
    .line 178
    invoke-direct {p2, p1, p3}, Lx19;-><init>(Landroid/view/Window;Llr5;)V

    .line 179
    .line 180
    .line 181
    :goto_0
    iget-object p1, p0, Low4;->h0:Lax4;

    .line 182
    .line 183
    iget-object p1, p1, Lax4;->c:Ljava/lang/Boolean;

    .line 184
    .line 185
    if-eqz p1, :cond_3

    .line 186
    .line 187
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 188
    .line 189
    .line 190
    move-result p1

    .line 191
    goto :goto_1

    .line 192
    :cond_3
    iget-wide p3, p0, Low4;->i0:J

    .line 193
    .line 194
    invoke-static {p3, p4}, Lx97;->F(J)Z

    .line 195
    .line 196
    .line 197
    move-result p1

    .line 198
    :goto_1
    invoke-virtual {p2, p1}, Leu7;->k(Z)V

    .line 199
    .line 200
    .line 201
    iget-object p1, p0, Low4;->h0:Lax4;

    .line 202
    .line 203
    iget-object p1, p1, Lax4;->d:Ljava/lang/Boolean;

    .line 204
    .line 205
    if-eqz p1, :cond_4

    .line 206
    .line 207
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 208
    .line 209
    .line 210
    move-result p1

    .line 211
    goto :goto_2

    .line 212
    :cond_4
    iget-wide p3, p0, Low4;->i0:J

    .line 213
    .line 214
    invoke-static {p3, p4}, Lx97;->F(J)Z

    .line 215
    .line 216
    .line 217
    move-result p1

    .line 218
    :goto_2
    invoke-virtual {p2, p1}, Leu7;->j(Z)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {p0}, Lpy0;->b()Lz95;

    .line 222
    .line 223
    .line 224
    move-result-object p1

    .line 225
    new-instance p2, Lnw4;

    .line 226
    .line 227
    iget-object p3, p0, Low4;->h0:Lax4;

    .line 228
    .line 229
    iget-boolean p3, p3, Lax4;->a:Z

    .line 230
    .line 231
    new-instance p4, Ltb2;

    .line 232
    .line 233
    const/16 p5, 0x15

    .line 234
    .line 235
    invoke-direct {p4, p0, p5}, Ltb2;-><init>(Ljava/lang/Object;B)V

    .line 236
    .line 237
    .line 238
    move-object/from16 p6, p10

    .line 239
    .line 240
    invoke-direct {p2, p3, p6, p9, p4}, Lnw4;-><init>(ZLb71;Loi;Ltb2;)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {p1, p0, p2}, Lz95;->a(Ld94;Lu95;)V

    .line 244
    .line 245
    .line 246
    return-void

    .line 247
    :cond_5
    const-string p0, "Dialog has no window"

    .line 248
    .line 249
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    const/4 p0, 0x0

    .line 253
    throw p0
.end method


# virtual methods
.method public final cancel()V
    .locals 0

    .line 1
    return-void
.end method

.method public final g(Ldn2;Lax4;JLz24;)V
    .locals 1

    .line 1
    iput-object p1, p0, Low4;->g0:Ldn2;

    .line 2
    .line 3
    iput-object p2, p0, Low4;->h0:Lax4;

    .line 4
    .line 5
    iput-wide p3, p0, Low4;->i0:J

    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Low4;->j0:Landroid/view/View;

    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    instance-of p2, p1, Landroid/view/WindowManager$LayoutParams;

    .line 21
    .line 22
    if-eqz p2, :cond_0

    .line 23
    .line 24
    check-cast p1, Landroid/view/WindowManager$LayoutParams;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 p1, 0x0

    .line 28
    :goto_0
    const/4 p2, 0x1

    .line 29
    const/16 p3, 0x2000

    .line 30
    .line 31
    const/4 p4, 0x0

    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    iget p1, p1, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 35
    .line 36
    and-int/2addr p1, p3

    .line 37
    if-eqz p1, :cond_1

    .line 38
    .line 39
    move p1, p2

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    move p1, p4

    .line 42
    :goto_1
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    if-eqz p1, :cond_2

    .line 50
    .line 51
    move p1, p3

    .line 52
    goto :goto_2

    .line 53
    :cond_2
    const/16 p1, -0x2001

    .line 54
    .line 55
    :goto_2
    invoke-virtual {v0, p1, p3}, Landroid/view/Window;->setFlags(II)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p5}, Ljava/lang/Enum;->ordinal()I

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    if-eqz p1, :cond_4

    .line 63
    .line 64
    if-ne p1, p2, :cond_3

    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_3
    invoke-static {}, Lb61;->c()V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :cond_4
    move p2, p4

    .line 72
    :goto_3
    iget-object p1, p0, Low4;->k0:Llw4;

    .line 73
    .line 74
    invoke-virtual {p1, p2}, Landroid/view/View;->setLayoutDirection(I)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    if-eqz p1, :cond_5

    .line 82
    .line 83
    const/4 p2, -0x1

    .line 84
    invoke-virtual {p1, p2, p2}, Landroid/view/Window;->setLayout(II)V

    .line 85
    .line 86
    .line 87
    :cond_5
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    if-eqz p0, :cond_7

    .line 92
    .line 93
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 94
    .line 95
    const/16 p2, 0x1e

    .line 96
    .line 97
    if-lt p1, p2, :cond_6

    .line 98
    .line 99
    const/16 p1, 0x30

    .line 100
    .line 101
    goto :goto_4

    .line 102
    :cond_6
    const/16 p1, 0x10

    .line 103
    .line 104
    :goto_4
    invoke-virtual {p0, p1}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 105
    .line 106
    .line 107
    :cond_7
    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Dialog;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Low4;->g0:Ldn2;

    .line 8
    .line 9
    invoke-interface {p0}, Ldn2;->invoke()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    :cond_0
    return p1
.end method
