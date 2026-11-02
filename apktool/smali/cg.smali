.class public final synthetic Lcg;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic X:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 9
    iput-byte p1, p0, Lcg;->X:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly73;)V
    .locals 0

    .line 1
    const/16 p1, 0x8

    .line 2
    .line 3
    iput-byte p1, p0, Lcg;->X:B

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 5

    .line 1
    iget-byte p0, p0, Lcg;->X:B

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    packed-switch p0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    check-cast p1, Lfz;

    .line 8
    .line 9
    check-cast p2, Lfz;

    .line 10
    .line 11
    iget-object p0, p1, Lfz;->a:Lwg1;

    .line 12
    .line 13
    iget-object p0, p0, Lwg1;->j:Ljava/lang/Class;

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    const-class v1, Lgl7;

    .line 17
    .line 18
    const-class v2, Llt5;

    .line 19
    .line 20
    const/4 v3, 0x2

    .line 21
    const-class v4, Landroid/media/MediaCodec;

    .line 22
    .line 23
    if-ne p0, v4, :cond_0

    .line 24
    .line 25
    move p0, v3

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    if-eq p0, v2, :cond_2

    .line 28
    .line 29
    if-ne p0, v1, :cond_1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    move p0, p1

    .line 33
    goto :goto_1

    .line 34
    :cond_2
    :goto_0
    move p0, v0

    .line 35
    :goto_1
    iget-object p2, p2, Lfz;->a:Lwg1;

    .line 36
    .line 37
    iget-object p2, p2, Lwg1;->j:Ljava/lang/Class;

    .line 38
    .line 39
    if-ne p2, v4, :cond_3

    .line 40
    .line 41
    move v0, v3

    .line 42
    goto :goto_2

    .line 43
    :cond_3
    if-eq p2, v2, :cond_5

    .line 44
    .line 45
    if-ne p2, v1, :cond_4

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_4
    move v0, p1

    .line 49
    :cond_5
    :goto_2
    sub-int/2addr p0, v0

    .line 50
    return p0

    .line 51
    :pswitch_0
    sget-object p0, Lg17;->b:Lew6;

    .line 52
    .line 53
    invoke-virtual {p0, p1, p2}, Lew6;->K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    check-cast p0, Ljava/lang/Number;

    .line 58
    .line 59
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    return p0

    .line 64
    :pswitch_1
    check-cast p1, Lzx;

    .line 65
    .line 66
    check-cast p2, Lzx;

    .line 67
    .line 68
    iget-object p0, p1, Lzx;->a:Ljava/lang/String;

    .line 69
    .line 70
    iget-object p1, p2, Lzx;->a:Ljava/lang/String;

    .line 71
    .line 72
    invoke-virtual {p0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    return p0

    .line 77
    :pswitch_2
    check-cast p1, Lf74;

    .line 78
    .line 79
    check-cast p2, Lf74;

    .line 80
    .line 81
    iget p0, p1, Lf74;->a:I

    .line 82
    .line 83
    iget p1, p2, Lf74;->a:I

    .line 84
    .line 85
    invoke-static {p0, p1}, Ldh3;->k(II)I

    .line 86
    .line 87
    .line 88
    move-result p0

    .line 89
    return p0

    .line 90
    :pswitch_3
    check-cast p1, Landroidx/compose/ui/node/LayoutNode;

    .line 91
    .line 92
    check-cast p2, Landroidx/compose/ui/node/LayoutNode;

    .line 93
    .line 94
    iget-object p0, p1, Landroidx/compose/ui/node/LayoutNode;->I0:Lr34;

    .line 95
    .line 96
    iget-object p0, p0, Lr34;->p:Lwr4;

    .line 97
    .line 98
    iget p0, p0, Lwr4;->H0:F

    .line 99
    .line 100
    iget-object v0, p2, Landroidx/compose/ui/node/LayoutNode;->I0:Lr34;

    .line 101
    .line 102
    iget-object v0, v0, Lr34;->p:Lwr4;

    .line 103
    .line 104
    iget v0, v0, Lwr4;->H0:F

    .line 105
    .line 106
    cmpg-float v1, p0, v0

    .line 107
    .line 108
    if-nez v1, :cond_6

    .line 109
    .line 110
    invoke-virtual {p1}, Landroidx/compose/ui/node/LayoutNode;->x()I

    .line 111
    .line 112
    .line 113
    move-result p0

    .line 114
    invoke-virtual {p2}, Landroidx/compose/ui/node/LayoutNode;->x()I

    .line 115
    .line 116
    .line 117
    move-result p1

    .line 118
    invoke-static {p0, p1}, Ldh3;->k(II)I

    .line 119
    .line 120
    .line 121
    move-result p0

    .line 122
    goto :goto_3

    .line 123
    :cond_6
    invoke-static {p0, v0}, Ljava/lang/Float;->compare(FF)I

    .line 124
    .line 125
    .line 126
    move-result p0

    .line 127
    :goto_3
    return p0

    .line 128
    :pswitch_4
    check-cast p1, Lkf3;

    .line 129
    .line 130
    check-cast p2, Lkf3;

    .line 131
    .line 132
    iget p0, p1, Lif3;->Y:I

    .line 133
    .line 134
    iget p1, p1, Lif3;->X:I

    .line 135
    .line 136
    sub-int/2addr p0, p1

    .line 137
    iget p1, p2, Lif3;->Y:I

    .line 138
    .line 139
    iget p2, p2, Lif3;->X:I

    .line 140
    .line 141
    sub-int/2addr p1, p2

    .line 142
    sub-int/2addr p0, p1

    .line 143
    return p0

    .line 144
    :pswitch_5
    check-cast p1, Lci3;

    .line 145
    .line 146
    check-cast p2, Lci3;

    .line 147
    .line 148
    iget p0, p1, Lci3;->b:I

    .line 149
    .line 150
    iget p1, p2, Lci3;->b:I

    .line 151
    .line 152
    invoke-static {p0, p1}, Ldh3;->k(II)I

    .line 153
    .line 154
    .line 155
    move-result p0

    .line 156
    return p0

    .line 157
    :pswitch_6
    check-cast p1, [B

    .line 158
    .line 159
    check-cast p2, [B

    .line 160
    .line 161
    array-length p0, p1

    .line 162
    array-length v1, p2

    .line 163
    if-eq p0, v1, :cond_7

    .line 164
    .line 165
    array-length p0, p1

    .line 166
    array-length p1, p2

    .line 167
    sub-int v0, p0, p1

    .line 168
    .line 169
    goto :goto_5

    .line 170
    :cond_7
    move p0, v0

    .line 171
    :goto_4
    array-length v1, p1

    .line 172
    if-ge p0, v1, :cond_9

    .line 173
    .line 174
    aget-byte v1, p1, p0

    .line 175
    .line 176
    aget-byte v2, p2, p0

    .line 177
    .line 178
    if-eq v1, v2, :cond_8

    .line 179
    .line 180
    sub-int v0, v1, v2

    .line 181
    .line 182
    goto :goto_5

    .line 183
    :cond_8
    add-int/lit8 p0, p0, 0x1

    .line 184
    .line 185
    goto :goto_4

    .line 186
    :cond_9
    :goto_5
    return v0

    .line 187
    :pswitch_7
    check-cast p1, Lju5;

    .line 188
    .line 189
    check-cast p2, Lju5;

    .line 190
    .line 191
    iget-boolean p0, p2, Lju5;->a:Z

    .line 192
    .line 193
    iget-boolean p1, p1, Lju5;->a:Z

    .line 194
    .line 195
    invoke-static {p0, p1}, Ldh3;->k(II)I

    .line 196
    .line 197
    .line 198
    move-result p0

    .line 199
    return p0

    .line 200
    nop

    .line 201
    :pswitch_data_0
    .packed-switch 0x0
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
