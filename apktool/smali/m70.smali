.class public final Lm70;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final synthetic a:B

.field public b:I

.field public c:Z

.field public final d:Ljava/lang/Object;

.field public final e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/Context;Llb;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, Lm70;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lm70;->d:Ljava/lang/Object;

    .line 8
    .line 9
    const/4 p2, 0x0

    .line 10
    iput p2, p0, Lm70;->b:I

    .line 11
    .line 12
    new-instance p2, Landroid/view/GestureDetector;

    .line 13
    .line 14
    new-instance v0, Ljc3;

    .line 15
    .line 16
    invoke-direct {v0, p0}, Ljc3;-><init>(Lm70;)V

    .line 17
    .line 18
    .line 19
    invoke-direct {p2, p1, v0}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    .line 20
    .line 21
    .line 22
    iput-object p2, p0, Lm70;->e:Ljava/lang/Object;

    .line 23
    .line 24
    return-void
.end method

.method public constructor <init>(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, Lm70;->a:B

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm70;->e:Ljava/lang/Object;

    .line 28
    new-instance p1, Lxb;

    const/4 v0, 0x2

    invoke-direct {p1, p0, v0}, Lxb;-><init>(Ljava/lang/Object;B)V

    iput-object p1, p0, Lm70;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/material/sidesheet/SideSheetBehavior;)V
    .locals 1

    const/4 v0, 0x3

    iput-byte v0, p0, Lm70;->a:B

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm70;->e:Ljava/lang/Object;

    .line 26
    new-instance p1, Lfl6;

    const/4 v0, 0x4

    invoke-direct {p1, p0, v0}, Lfl6;-><init>(Ljava/lang/Object;B)V

    iput-object p1, p0, Lm70;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/nio/charset/Charset;ZI)V
    .locals 1

    const/4 v0, 0x2

    iput-byte v0, p0, Lm70;->a:B

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lm70;->d:Ljava/lang/Object;

    .line 31
    iput-boolean p3, p0, Lm70;->c:Z

    .line 32
    new-instance p3, Lwx1;

    invoke-direct {p3, p1, p2}, Lwx1;-><init>(Ljava/lang/String;Ljava/nio/charset/Charset;)V

    iput-object p3, p0, Lm70;->e:Ljava/lang/Object;

    .line 33
    iput p4, p0, Lm70;->b:I

    return-void
.end method

.method public static a([[[Lvv4;ILvv4;)V
    .locals 3

    .line 1
    iget v0, p2, Lvv4;->d:I

    .line 2
    .line 3
    add-int/2addr p1, v0

    .line 4
    aget-object p0, p0, p1

    .line 5
    .line 6
    iget p1, p2, Lvv4;->c:I

    .line 7
    .line 8
    aget-object p0, p0, p1

    .line 9
    .line 10
    iget-object p1, p2, Lvv4;->a:Lgx4;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x2

    .line 17
    const/4 v2, 0x1

    .line 18
    if-eq v0, v2, :cond_3

    .line 19
    .line 20
    if-eq v0, v1, :cond_2

    .line 21
    .line 22
    const/4 v1, 0x4

    .line 23
    if-eq v0, v1, :cond_1

    .line 24
    .line 25
    const/4 v1, 0x6

    .line 26
    if-ne v0, v1, :cond_0

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const-string p0, "Illegal mode "

    .line 31
    .line 32
    invoke-static {p1, p0}, Lu52;->r(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    const/4 v1, 0x3

    .line 37
    goto :goto_0

    .line 38
    :cond_2
    move v1, v2

    .line 39
    :cond_3
    :goto_0
    aget-object p1, p0, v1

    .line 40
    .line 41
    if-eqz p1, :cond_5

    .line 42
    .line 43
    iget p1, p1, Lvv4;->f:I

    .line 44
    .line 45
    iget v0, p2, Lvv4;->f:I

    .line 46
    .line 47
    if-le p1, v0, :cond_4

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_4
    return-void

    .line 51
    :cond_5
    :goto_1
    aput-object p2, p0, v1

    .line 52
    .line 53
    return-void
.end method

.method public static c(Lgx4;C)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/4 v0, 0x1

    .line 6
    if-eq p0, v0, :cond_3

    .line 7
    .line 8
    const/4 v1, 0x2

    .line 9
    if-eq p0, v1, :cond_1

    .line 10
    .line 11
    const/4 v1, 0x4

    .line 12
    if-eq p0, v1, :cond_4

    .line 13
    .line 14
    const/4 v0, 0x6

    .line 15
    if-eq p0, v0, :cond_0

    .line 16
    .line 17
    goto :goto_2

    .line 18
    :cond_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-static {p0}, Lt02;->b(Ljava/lang/String;)Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    return p0

    .line 27
    :cond_1
    sget-object p0, Lt02;->a:[I

    .line 28
    .line 29
    const/16 v1, 0x60

    .line 30
    .line 31
    const/4 v2, -0x1

    .line 32
    if-ge p1, v1, :cond_2

    .line 33
    .line 34
    aget p0, p0, p1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    move p0, v2

    .line 38
    :goto_0
    if-eq p0, v2, :cond_5

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_3
    const/16 p0, 0x30

    .line 42
    .line 43
    if-lt p1, p0, :cond_5

    .line 44
    .line 45
    const/16 p0, 0x39

    .line 46
    .line 47
    if-gt p1, p0, :cond_5

    .line 48
    .line 49
    :cond_4
    :goto_1
    return v0

    .line 50
    :cond_5
    :goto_2
    const/4 p0, 0x0

    .line 51
    return p0
.end method

.method public static f(I)Lav8;
    .locals 1

    .line 1
    invoke-static {p0}, Lp61;->B(I)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_1

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    if-eq p0, v0, :cond_0

    .line 9
    .line 10
    const/16 p0, 0x28

    .line 11
    .line 12
    invoke-static {p0}, Lav8;->c(I)Lav8;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :cond_0
    const/16 p0, 0x1a

    .line 18
    .line 19
    invoke-static {p0}, Lav8;->c(I)Lav8;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    :cond_1
    const/16 p0, 0x9

    .line 25
    .line 26
    invoke-static {p0}, Lav8;->c(I)Lav8;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0
.end method


# virtual methods
.method public b(Lav8;[[[Lvv4;ILvv4;)V
    .locals 12

    .line 1
    move v3, p3

    .line 2
    iget-object v0, p0, Lm70;->d:Ljava/lang/Object;

    .line 3
    .line 4
    move-object v8, v0

    .line 5
    check-cast v8, Ljava/lang/String;

    .line 6
    .line 7
    iget-object v0, p0, Lm70;->e:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lwx1;

    .line 10
    .line 11
    iget-object v9, v0, Lwx1;->a:[Ljava/nio/charset/CharsetEncoder;

    .line 12
    .line 13
    array-length v2, v9

    .line 14
    iget v0, v0, Lwx1;->b:I

    .line 15
    .line 16
    const-string v10, ""

    .line 17
    .line 18
    if-ltz v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {v8, p3}, Ljava/lang/String;->charAt(I)C

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    aget-object v5, v9, v0

    .line 25
    .line 26
    new-instance v6, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {v6, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-virtual {v5, v4}, Ljava/nio/charset/CharsetEncoder;->canEncode(Ljava/lang/CharSequence;)Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-eqz v4, :cond_0

    .line 43
    .line 44
    add-int/lit8 v2, v0, 0x1

    .line 45
    .line 46
    :goto_0
    move v11, v2

    .line 47
    goto :goto_1

    .line 48
    :cond_0
    const/4 v0, 0x0

    .line 49
    goto :goto_0

    .line 50
    :goto_1
    move v4, v0

    .line 51
    :goto_2
    if-ge v4, v11, :cond_2

    .line 52
    .line 53
    invoke-virtual {v8, p3}, Ljava/lang/String;->charAt(I)C

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    aget-object v2, v9, v4

    .line 58
    .line 59
    new-instance v5, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    invoke-direct {v5, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-virtual {v2, v0}, Ljava/nio/charset/CharsetEncoder;->canEncode(Ljava/lang/CharSequence;)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-eqz v0, :cond_1

    .line 76
    .line 77
    new-instance v0, Lvv4;

    .line 78
    .line 79
    sget-object v2, Lgx4;->i0:Lgx4;

    .line 80
    .line 81
    const/4 v5, 0x1

    .line 82
    move-object v1, p0

    .line 83
    move-object v7, p1

    .line 84
    move-object/from16 v6, p4

    .line 85
    .line 86
    invoke-direct/range {v0 .. v7}, Lvv4;-><init>(Lm70;Lgx4;IIILvv4;Lav8;)V

    .line 87
    .line 88
    .line 89
    invoke-static {p2, p3, v0}, Lm70;->a([[[Lvv4;ILvv4;)V

    .line 90
    .line 91
    .line 92
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_2
    invoke-virtual {v8, p3}, Ljava/lang/String;->charAt(I)C

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    sget-object v2, Lgx4;->k0:Lgx4;

    .line 100
    .line 101
    invoke-static {v2, v0}, Lm70;->c(Lgx4;C)Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-eqz v0, :cond_3

    .line 106
    .line 107
    new-instance v0, Lvv4;

    .line 108
    .line 109
    const/4 v4, 0x0

    .line 110
    const/4 v5, 0x1

    .line 111
    move-object v1, p0

    .line 112
    move-object v7, p1

    .line 113
    move-object/from16 v6, p4

    .line 114
    .line 115
    invoke-direct/range {v0 .. v7}, Lvv4;-><init>(Lm70;Lgx4;IIILvv4;Lav8;)V

    .line 116
    .line 117
    .line 118
    invoke-static {p2, p3, v0}, Lm70;->a([[[Lvv4;ILvv4;)V

    .line 119
    .line 120
    .line 121
    :cond_3
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 122
    .line 123
    .line 124
    move-result v9

    .line 125
    invoke-virtual {v8, p3}, Ljava/lang/String;->charAt(I)C

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    sget-object v2, Lgx4;->g0:Lgx4;

    .line 130
    .line 131
    invoke-static {v2, v0}, Lm70;->c(Lgx4;C)Z

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    const/4 v10, 0x2

    .line 136
    const/4 v11, 0x1

    .line 137
    if-eqz v0, :cond_6

    .line 138
    .line 139
    new-instance v0, Lvv4;

    .line 140
    .line 141
    add-int/lit8 v1, v3, 0x1

    .line 142
    .line 143
    if-ge v1, v9, :cond_5

    .line 144
    .line 145
    invoke-virtual {v8, v1}, Ljava/lang/String;->charAt(I)C

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    invoke-static {v2, v1}, Lm70;->c(Lgx4;C)Z

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    if-nez v1, :cond_4

    .line 154
    .line 155
    goto :goto_3

    .line 156
    :cond_4
    move v5, v10

    .line 157
    goto :goto_4

    .line 158
    :cond_5
    :goto_3
    move v5, v11

    .line 159
    :goto_4
    const/4 v4, 0x0

    .line 160
    move-object v1, p0

    .line 161
    move-object v7, p1

    .line 162
    move-object/from16 v6, p4

    .line 163
    .line 164
    invoke-direct/range {v0 .. v7}, Lvv4;-><init>(Lm70;Lgx4;IIILvv4;Lav8;)V

    .line 165
    .line 166
    .line 167
    invoke-static {p2, p3, v0}, Lm70;->a([[[Lvv4;ILvv4;)V

    .line 168
    .line 169
    .line 170
    :cond_6
    invoke-virtual {v8, p3}, Ljava/lang/String;->charAt(I)C

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    sget-object v2, Lgx4;->f0:Lgx4;

    .line 175
    .line 176
    invoke-static {v2, v0}, Lm70;->c(Lgx4;C)Z

    .line 177
    .line 178
    .line 179
    move-result v0

    .line 180
    if-eqz v0, :cond_b

    .line 181
    .line 182
    new-instance v0, Lvv4;

    .line 183
    .line 184
    add-int/lit8 v1, v3, 0x1

    .line 185
    .line 186
    if-ge v1, v9, :cond_a

    .line 187
    .line 188
    invoke-virtual {v8, v1}, Ljava/lang/String;->charAt(I)C

    .line 189
    .line 190
    .line 191
    move-result v1

    .line 192
    invoke-static {v2, v1}, Lm70;->c(Lgx4;C)Z

    .line 193
    .line 194
    .line 195
    move-result v1

    .line 196
    if-nez v1, :cond_7

    .line 197
    .line 198
    goto :goto_6

    .line 199
    :cond_7
    add-int/lit8 v1, v3, 0x2

    .line 200
    .line 201
    if-ge v1, v9, :cond_9

    .line 202
    .line 203
    invoke-virtual {v8, v1}, Ljava/lang/String;->charAt(I)C

    .line 204
    .line 205
    .line 206
    move-result v1

    .line 207
    invoke-static {v2, v1}, Lm70;->c(Lgx4;C)Z

    .line 208
    .line 209
    .line 210
    move-result v1

    .line 211
    if-nez v1, :cond_8

    .line 212
    .line 213
    goto :goto_5

    .line 214
    :cond_8
    const/4 v10, 0x3

    .line 215
    :cond_9
    :goto_5
    move v5, v10

    .line 216
    goto :goto_7

    .line 217
    :cond_a
    :goto_6
    move v5, v11

    .line 218
    :goto_7
    const/4 v4, 0x0

    .line 219
    move-object v1, p0

    .line 220
    move-object v7, p1

    .line 221
    move-object/from16 v6, p4

    .line 222
    .line 223
    invoke-direct/range {v0 .. v7}, Lvv4;-><init>(Lm70;Lgx4;IIILvv4;Lav8;)V

    .line 224
    .line 225
    .line 226
    invoke-static {p2, p3, v0}, Lm70;->a([[[Lvv4;ILvv4;)V

    .line 227
    .line 228
    .line 229
    :cond_b
    return-void
.end method

.method public d(I)V
    .locals 4

    .line 1
    iget-byte v0, p0, Lm70;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, Lm70;->d:Ljava/lang/Object;

    .line 5
    .line 6
    iget-object v3, p0, Lm70;->e:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast v3, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 12
    .line 13
    iget-object v0, v3, Lcom/google/android/material/sidesheet/SideSheetBehavior;->p:Ljava/lang/ref/WeakReference;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iput p1, p0, Lm70;->b:I

    .line 25
    .line 26
    iget-boolean p1, p0, Lm70;->c:Z

    .line 27
    .line 28
    if-nez p1, :cond_1

    .line 29
    .line 30
    iget-object p1, v3, Lcom/google/android/material/sidesheet/SideSheetBehavior;->p:Ljava/lang/ref/WeakReference;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, Landroid/view/View;

    .line 37
    .line 38
    check-cast v2, Lfl6;

    .line 39
    .line 40
    invoke-virtual {p1, v2}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 41
    .line 42
    .line 43
    iput-boolean v1, p0, Lm70;->c:Z

    .line 44
    .line 45
    :cond_1
    :goto_0
    return-void

    .line 46
    :pswitch_0
    check-cast v3, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 47
    .line 48
    iget-object v0, v3, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Y:Ljava/lang/ref/WeakReference;

    .line 49
    .line 50
    if-eqz v0, :cond_3

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    if-nez v0, :cond_2

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    iput p1, p0, Lm70;->b:I

    .line 60
    .line 61
    iget-boolean p1, p0, Lm70;->c:Z

    .line 62
    .line 63
    if-nez p1, :cond_3

    .line 64
    .line 65
    iget-object p1, v3, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Y:Ljava/lang/ref/WeakReference;

    .line 66
    .line 67
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    check-cast p1, Landroid/view/View;

    .line 72
    .line 73
    check-cast v2, Lxb;

    .line 74
    .line 75
    invoke-virtual {p1, v2}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 76
    .line 77
    .line 78
    iput-boolean v1, p0, Lm70;->c:Z

    .line 79
    .line 80
    :cond_3
    :goto_1
    return-void

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public e(Lav8;)Lf63;
    .locals 12

    .line 1
    iget-object v0, p0, Lm70;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    add-int/lit8 v2, v1, 0x1

    .line 10
    .line 11
    iget-object v3, p0, Lm70;->e:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v3, Lwx1;

    .line 14
    .line 15
    iget-object v3, v3, Lwx1;->a:[Ljava/nio/charset/CharsetEncoder;

    .line 16
    .line 17
    array-length v4, v3

    .line 18
    const/4 v5, 0x3

    .line 19
    new-array v5, v5, [I

    .line 20
    .line 21
    const/4 v6, 0x2

    .line 22
    const/4 v7, 0x4

    .line 23
    aput v7, v5, v6

    .line 24
    .line 25
    const/4 v6, 0x1

    .line 26
    aput v4, v5, v6

    .line 27
    .line 28
    const/4 v4, 0x0

    .line 29
    aput v2, v5, v4

    .line 30
    .line 31
    const-class v2, Lvv4;

    .line 32
    .line 33
    invoke-static {v2, v5}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    check-cast v2, [[[Lvv4;

    .line 38
    .line 39
    const/4 v5, 0x0

    .line 40
    invoke-virtual {p0, p1, v2, v4, v5}, Lm70;->b(Lav8;[[[Lvv4;ILvv4;)V

    .line 41
    .line 42
    .line 43
    :goto_0
    if-gt v6, v1, :cond_3

    .line 44
    .line 45
    move v5, v4

    .line 46
    :goto_1
    array-length v8, v3

    .line 47
    if-ge v5, v8, :cond_2

    .line 48
    .line 49
    move v8, v4

    .line 50
    :goto_2
    if-ge v8, v7, :cond_1

    .line 51
    .line 52
    aget-object v9, v2, v6

    .line 53
    .line 54
    aget-object v9, v9, v5

    .line 55
    .line 56
    aget-object v9, v9, v8

    .line 57
    .line 58
    if-eqz v9, :cond_0

    .line 59
    .line 60
    if-ge v6, v1, :cond_0

    .line 61
    .line 62
    invoke-virtual {p0, p1, v2, v6, v9}, Lm70;->b(Lav8;[[[Lvv4;ILvv4;)V

    .line 63
    .line 64
    .line 65
    :cond_0
    add-int/lit8 v8, v8, 0x1

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_1
    add-int/lit8 v5, v5, 0x1

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_2
    add-int/lit8 v6, v6, 0x1

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_3
    const/4 v5, -0x1

    .line 75
    const v6, 0x7fffffff

    .line 76
    .line 77
    .line 78
    move v9, v4

    .line 79
    move v8, v6

    .line 80
    move v6, v5

    .line 81
    :goto_3
    array-length v10, v3

    .line 82
    if-ge v9, v10, :cond_6

    .line 83
    .line 84
    move v10, v4

    .line 85
    :goto_4
    if-ge v10, v7, :cond_5

    .line 86
    .line 87
    aget-object v11, v2, v1

    .line 88
    .line 89
    aget-object v11, v11, v9

    .line 90
    .line 91
    aget-object v11, v11, v10

    .line 92
    .line 93
    if-eqz v11, :cond_4

    .line 94
    .line 95
    iget v11, v11, Lvv4;->f:I

    .line 96
    .line 97
    if-ge v11, v8, :cond_4

    .line 98
    .line 99
    move v5, v9

    .line 100
    move v6, v10

    .line 101
    move v8, v11

    .line 102
    :cond_4
    add-int/lit8 v10, v10, 0x1

    .line 103
    .line 104
    goto :goto_4

    .line 105
    :cond_5
    add-int/lit8 v9, v9, 0x1

    .line 106
    .line 107
    goto :goto_3

    .line 108
    :cond_6
    if-ltz v5, :cond_7

    .line 109
    .line 110
    new-instance v0, Lf63;

    .line 111
    .line 112
    aget-object v1, v2, v1

    .line 113
    .line 114
    aget-object v1, v1, v5

    .line 115
    .line 116
    aget-object v1, v1, v6

    .line 117
    .line 118
    invoke-direct {v0, p0, p1, v1}, Lf63;-><init>(Lm70;Lav8;Lvv4;)V

    .line 119
    .line 120
    .line 121
    return-object v0

    .line 122
    :cond_7
    new-instance p0, Ls59;

    .line 123
    .line 124
    const-string p1, "Internal error: failed to encode \""

    .line 125
    .line 126
    const-string v1, "\""

    .line 127
    .line 128
    invoke-static {p1, v0, v1}, Lpc6;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    throw p0
.end method
