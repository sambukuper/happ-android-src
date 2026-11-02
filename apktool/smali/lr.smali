.class public final Llr;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lxo2;
.implements Lov8;
.implements Lf91;
.implements Lm82;
.implements Lsd0;


# static fields
.field public static volatile g0:Llr;

.field public static final h0:Ljava/lang/Object;

.field public static final i0:[B


# instance fields
.field public final synthetic X:B

.field public Y:Ljava/lang/Object;

.field public Z:Ljava/lang/Object;

.field public f0:Ljava/lang/Object;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Llr;->h0:Ljava/lang/Object;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    new-array v0, v0, [B

    .line 10
    .line 11
    sput-object v0, Llr;->i0:[B

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(B)V
    .locals 2

    iput-byte p1, p0, Llr;->X:B

    sparse-switch p1, :sswitch_data_0

    .line 155
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 156
    new-instance p1, Lg55;

    const/16 v0, 0x1d

    .line 157
    invoke-direct {p1, v0}, Lg55;-><init>(B)V

    .line 158
    iput-object p1, p0, Llr;->f0:Ljava/lang/Object;

    return-void

    .line 159
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 160
    new-instance p1, Ls05;

    invoke-direct {p1}, Ls05;-><init>()V

    iput-object p1, p0, Llr;->Y:Ljava/lang/Object;

    return-void

    .line 161
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 p1, 0xa

    .line 162
    new-array v0, p1, [I

    .line 163
    iput-object v0, p0, Llr;->Y:Ljava/lang/Object;

    .line 164
    new-array v0, p1, [I

    .line 165
    iput-object v0, p0, Llr;->Z:Ljava/lang/Object;

    .line 166
    new-array p1, p1, [I

    .line 167
    iput-object p1, p0, Llr;->f0:Ljava/lang/Object;

    return-void

    .line 168
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 169
    new-instance p1, Lyr2;

    const/16 v0, 0x18

    invoke-direct {p1, v0}, Lyr2;-><init>(B)V

    iput-object p1, p0, Llr;->Y:Ljava/lang/Object;

    .line 170
    new-instance p1, Lyr2;

    invoke-direct {p1, v0}, Lyr2;-><init>(B)V

    iput-object p1, p0, Llr;->Z:Ljava/lang/Object;

    .line 171
    new-instance p1, Lyr2;

    invoke-direct {p1, v0}, Lyr2;-><init>(B)V

    iput-object p1, p0, Llr;->f0:Ljava/lang/Object;

    return-void

    .line 172
    :sswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 173
    new-instance p1, Le68;

    .line 174
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x7fc00000    # Float.NaN

    .line 175
    iput v0, p1, Le68;->a:F

    .line 176
    iput-object p1, p0, Llr;->Y:Ljava/lang/Object;

    .line 177
    new-instance p1, Lyr2;

    const/16 v0, 0x14

    const/4 v1, 0x0

    .line 178
    invoke-direct {p1, v0, v1}, Lyr2;-><init>(BZ)V

    .line 179
    iput-object p1, p0, Llr;->Z:Ljava/lang/Object;

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x8 -> :sswitch_3
        0x15 -> :sswitch_2
        0x17 -> :sswitch_1
        0x1a -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic constructor <init>(BLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V
    .locals 0

    .line 195
    iput-byte p1, p0, Llr;->X:B

    iput-object p2, p0, Llr;->f0:Ljava/lang/Object;

    iput-object p3, p0, Llr;->Y:Ljava/lang/Object;

    iput-object p4, p0, Llr;->Z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(BZ)V
    .locals 0

    .line 149
    iput-byte p1, p0, Llr;->X:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;B)V
    .locals 3

    .line 1
    iput-byte p2, p0, Llr;->X:B

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iput-object p1, p0, Llr;->f0:Ljava/lang/Object;

    .line 14
    .line 15
    new-instance p1, Ljava/util/HashSet;

    .line 16
    .line 17
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Llr;->Z:Ljava/lang/Object;

    .line 21
    .line 22
    new-instance p1, Ljava/util/HashMap;

    .line 23
    .line 24
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, Llr;->Y:Ljava/lang/Object;

    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    .line 32
    .line 33
    sget p2, Lu26;->materialCalendarStyle:I

    .line 34
    .line 35
    const-class v0, Lwq4;

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-static {p2, p1, v0}, Lu70;->i0(ILandroid/content/Context;Ljava/lang/String;)Landroid/util/TypedValue;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    iget p2, p2, Landroid/util/TypedValue;->data:I

    .line 46
    .line 47
    sget-object v0, Lv56;->MaterialCalendar:[I

    .line 48
    .line 49
    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    sget v0, Lv56;->MaterialCalendar_dayStyle:I

    .line 54
    .line 55
    const/4 v1, 0x0

    .line 56
    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    invoke-static {p1, v0}, Lyr2;->j(Landroid/content/Context;I)Lyr2;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iput-object v0, p0, Llr;->Y:Ljava/lang/Object;

    .line 65
    .line 66
    sget v0, Lv56;->MaterialCalendar_dayInvalidStyle:I

    .line 67
    .line 68
    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    invoke-static {p1, v0}, Lyr2;->j(Landroid/content/Context;I)Lyr2;

    .line 73
    .line 74
    .line 75
    sget v0, Lv56;->MaterialCalendar_daySelectedStyle:I

    .line 76
    .line 77
    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    invoke-static {p1, v0}, Lyr2;->j(Landroid/content/Context;I)Lyr2;

    .line 82
    .line 83
    .line 84
    sget v0, Lv56;->MaterialCalendar_dayTodayStyle:I

    .line 85
    .line 86
    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    invoke-static {p1, v0}, Lyr2;->j(Landroid/content/Context;I)Lyr2;

    .line 91
    .line 92
    .line 93
    sget v0, Lv56;->MaterialCalendar_rangeFillColor:I

    .line 94
    .line 95
    invoke-static {p1, p2, v0}, Lys0;->x(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    sget v2, Lv56;->MaterialCalendar_yearStyle:I

    .line 100
    .line 101
    invoke-virtual {p2, v2, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    invoke-static {p1, v2}, Lyr2;->j(Landroid/content/Context;I)Lyr2;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    iput-object v2, p0, Llr;->Z:Ljava/lang/Object;

    .line 110
    .line 111
    sget v2, Lv56;->MaterialCalendar_yearSelectedStyle:I

    .line 112
    .line 113
    invoke-virtual {p2, v2, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    invoke-static {p1, v2}, Lyr2;->j(Landroid/content/Context;I)Lyr2;

    .line 118
    .line 119
    .line 120
    sget v2, Lv56;->MaterialCalendar_yearTodayStyle:I

    .line 121
    .line 122
    invoke-virtual {p2, v2, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    invoke-static {p1, v1}, Lyr2;->j(Landroid/content/Context;I)Lyr2;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    iput-object p1, p0, Llr;->f0:Ljava/lang/Object;

    .line 131
    .line 132
    new-instance p0, Landroid/graphics/Paint;

    .line 133
    .line 134
    invoke-direct {p0}, Landroid/graphics/Paint;-><init>()V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 138
    .line 139
    .line 140
    move-result p1

    .line 141
    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 145
    .line 146
    .line 147
    return-void

    .line 148
    nop

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Lcom/google/firebase/messaging/FirebaseMessagingService;Lq02;Ljava/util/concurrent/ExecutorService;)V
    .locals 1

    const/16 v0, 0x16

    iput-byte v0, p0, Llr;->X:B

    .line 184
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 185
    iput-object p3, p0, Llr;->Y:Ljava/lang/Object;

    .line 186
    iput-object p1, p0, Llr;->Z:Ljava/lang/Object;

    .line 187
    iput-object p2, p0, Llr;->f0:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ldn2;Lvn1;Lzy0;)V
    .locals 1

    const/16 v0, 0xb

    iput-byte v0, p0, Llr;->X:B

    .line 211
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 212
    iput-object p1, p0, Llr;->Y:Ljava/lang/Object;

    .line 213
    iput-object p2, p0, Llr;->Z:Ljava/lang/Object;

    .line 214
    iput-object p3, p0, Llr;->f0:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lj52;Li52;Lzz2;)V
    .locals 1

    const/16 v0, 0x19

    iput-byte v0, p0, Llr;->X:B

    iput-object p1, p0, Llr;->Z:Ljava/lang/Object;

    iput-object p2, p0, Llr;->f0:Ljava/lang/Object;

    .line 188
    iput-byte v0, p0, Llr;->X:B

    .line 189
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 190
    iput-object p3, p0, Llr;->Y:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 151
    iput-byte p4, p0, Llr;->X:B

    iput-object p1, p0, Llr;->Y:Ljava/lang/Object;

    iput-object p2, p0, Llr;->Z:Ljava/lang/Object;

    iput-object p3, p0, Llr;->f0:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lld2;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, Llr;->X:B

    .line 180
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 181
    iput-object p1, p0, Llr;->Y:Ljava/lang/Object;

    .line 182
    sget-object p1, Llr;->i0:[B

    iput-object p1, p0, Llr;->Z:Ljava/lang/Object;

    const/16 p1, 0x20

    .line 183
    new-array p1, p1, [I

    iput-object p1, p0, Llr;->f0:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Llr;Ljava/lang/Class;)V
    .locals 1

    const/16 v0, 0x12

    iput-byte v0, p0, Llr;->X:B

    .line 152
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 153
    iput-object p1, p0, Llr;->Y:Ljava/lang/Object;

    .line 154
    iput-object p2, p0, Llr;->Z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ln31;)V
    .locals 1

    const/16 v0, 0xc

    iput-byte v0, p0, Llr;->X:B

    .line 196
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 197
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Llr;->Y:Ljava/lang/Object;

    .line 198
    new-instance v0, Ld30;

    .line 199
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 200
    iput-object v0, p0, Llr;->Z:Ljava/lang/Object;

    .line 201
    iput-object p1, p0, Llr;->f0:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lq02;[B[B)V
    .locals 1

    const/4 v0, 0x3

    iput-byte v0, p0, Llr;->X:B

    .line 150
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llr;->f0:Ljava/lang/Object;

    invoke-static {p2}, Lch3;->o([B)[B

    move-result-object p1

    iput-object p1, p0, Llr;->Z:Ljava/lang/Object;

    invoke-static {p3}, Lch3;->o([B)[B

    move-result-object p1

    iput-object p1, p0, Llr;->Y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lum0;)V
    .locals 1

    const/16 v0, 0xf

    iput-byte v0, p0, Llr;->X:B

    .line 191
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 192
    iput-object p1, p0, Llr;->f0:Ljava/lang/Object;

    .line 193
    new-instance p1, Lwl6;

    const/16 v0, 0x11

    invoke-direct {p1, p0, v0}, Lwl6;-><init>(Ljava/lang/Object;B)V

    .line 194
    iput-object p1, p0, Llr;->Y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lz47;Lbe;Lre1;Ljava/util/Set;)V
    .locals 7

    const/16 v0, 0x18

    iput-byte v0, p0, Llr;->X:B

    .line 202
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 203
    iput-object p2, p0, Llr;->Y:Ljava/lang/Object;

    .line 204
    iput-object p1, p0, Llr;->Z:Ljava/lang/Object;

    .line 205
    iput-object p3, p0, Llr;->f0:Ljava/lang/Object;

    .line 206
    invoke-interface {p4}, Ljava/util/Set;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_1

    .line 207
    :cond_0
    invoke-interface {p4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [I

    .line 208
    new-instance v1, Ljava/lang/String;

    array-length p3, p2

    const/4 p4, 0x0

    invoke-direct {v1, p2, p4, p3}, Ljava/lang/String;-><init>([III)V

    .line 209
    new-instance v6, Lz31;

    const/4 p2, 0x1

    invoke-direct {v6, v1, p2}, Lz31;-><init>(Ljava/lang/String;B)V

    .line 210
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v4, 0x1

    const/4 v5, 0x1

    const/4 v2, 0x0

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, Llr;->y(Ljava/lang/CharSequence;IIIZLkz1;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public static g(Landroid/text/Editable;Landroid/view/KeyEvent;Z)Z
    .locals 6

    .line 1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getMetaState()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-static {p1}, Landroid/view/KeyEvent;->metaStateHasNoModifiers(I)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    const/4 v0, 0x0

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_0
    invoke-static {p0}, Landroid/text/Selection;->getSelectionStart(Ljava/lang/CharSequence;)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-static {p0}, Landroid/text/Selection;->getSelectionEnd(Ljava/lang/CharSequence;)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/4 v2, -0x1

    .line 22
    if-eq p1, v2, :cond_6

    .line 23
    .line 24
    if-eq v1, v2, :cond_6

    .line 25
    .line 26
    if-eq p1, v1, :cond_1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    const-class v2, Lpj8;

    .line 30
    .line 31
    invoke-interface {p0, p1, v1, v2}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, [Lpj8;

    .line 36
    .line 37
    if-eqz v1, :cond_6

    .line 38
    .line 39
    array-length v2, v1

    .line 40
    if-lez v2, :cond_6

    .line 41
    .line 42
    array-length v2, v1

    .line 43
    move v3, v0

    .line 44
    :goto_0
    if-ge v3, v2, :cond_6

    .line 45
    .line 46
    aget-object v4, v1, v3

    .line 47
    .line 48
    invoke-interface {p0, v4}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    invoke-interface {p0, v4}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-eqz p2, :cond_2

    .line 57
    .line 58
    if-eq v5, p1, :cond_4

    .line 59
    .line 60
    :cond_2
    if-nez p2, :cond_3

    .line 61
    .line 62
    if-eq v4, p1, :cond_4

    .line 63
    .line 64
    :cond_3
    if-le p1, v5, :cond_5

    .line 65
    .line 66
    if-ge p1, v4, :cond_5

    .line 67
    .line 68
    :cond_4
    invoke-interface {p0, v5, v4}, Landroid/text/Editable;->delete(II)Landroid/text/Editable;

    .line 69
    .line 70
    .line 71
    const/4 p0, 0x1

    .line 72
    return p0

    .line 73
    :cond_5
    add-int/lit8 v3, v3, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_6
    :goto_1
    return v0
.end method

.method public static n(Landroid/content/Context;)Llr;
    .locals 3

    .line 1
    sget-object v0, Llr;->g0:Llr;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    sget-object v0, Llr;->h0:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Llr;->g0:Llr;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Llr;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-direct {v1, p0, v2}, Llr;-><init>(Landroid/content/Context;B)V

    .line 16
    .line 17
    .line 18
    sput-object v1, Llr;->g0:Llr;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception p0

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    :goto_0
    monitor-exit v0

    .line 24
    goto :goto_2

    .line 25
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    throw p0

    .line 27
    :cond_1
    :goto_2
    sget-object p0, Llr;->g0:Llr;

    .line 28
    .line 29
    return-object p0
.end method

.method public static r(Lgz1;Landroid/text/Editable;IIZ)Z
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_19

    .line 3
    .line 4
    if-ltz p2, :cond_19

    .line 5
    .line 6
    if-gez p3, :cond_0

    .line 7
    .line 8
    goto/16 :goto_9

    .line 9
    .line 10
    :cond_0
    invoke-static {p1}, Landroid/text/Selection;->getSelectionStart(Ljava/lang/CharSequence;)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-static {p1}, Landroid/text/Selection;->getSelectionEnd(Ljava/lang/CharSequence;)I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, -0x1

    .line 19
    if-eq v1, v3, :cond_19

    .line 20
    .line 21
    if-eq v2, v3, :cond_19

    .line 22
    .line 23
    if-eq v1, v2, :cond_1

    .line 24
    .line 25
    goto/16 :goto_9

    .line 26
    .line 27
    :cond_1
    const/4 v4, 0x1

    .line 28
    if-eqz p4, :cond_16

    .line 29
    .line 30
    invoke-static {p2, v0}, Ljava/lang/Math;->max(II)I

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 35
    .line 36
    .line 37
    move-result p4

    .line 38
    if-ltz v1, :cond_3

    .line 39
    .line 40
    if-ge p4, v1, :cond_2

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    if-gez p2, :cond_4

    .line 44
    .line 45
    :cond_3
    :goto_0
    move v1, v3

    .line 46
    goto :goto_3

    .line 47
    :cond_4
    :goto_1
    move p4, v0

    .line 48
    :goto_2
    if-nez p2, :cond_5

    .line 49
    .line 50
    goto :goto_3

    .line 51
    :cond_5
    add-int/lit8 v1, v1, -0x1

    .line 52
    .line 53
    if-gez v1, :cond_7

    .line 54
    .line 55
    if-eqz p4, :cond_6

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_6
    move v1, v0

    .line 59
    goto :goto_3

    .line 60
    :cond_7
    invoke-interface {p1, v1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    if-eqz p4, :cond_9

    .line 65
    .line 66
    invoke-static {v5}, Ljava/lang/Character;->isHighSurrogate(C)Z

    .line 67
    .line 68
    .line 69
    move-result p4

    .line 70
    if-nez p4, :cond_8

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_8
    add-int/lit8 p2, p2, -0x1

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_9
    invoke-static {v5}, Ljava/lang/Character;->isSurrogate(C)Z

    .line 77
    .line 78
    .line 79
    move-result v6

    .line 80
    if-nez v6, :cond_a

    .line 81
    .line 82
    add-int/lit8 p2, p2, -0x1

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_a
    invoke-static {v5}, Ljava/lang/Character;->isHighSurrogate(C)Z

    .line 86
    .line 87
    .line 88
    move-result p4

    .line 89
    if-eqz p4, :cond_b

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_b
    move p4, v4

    .line 93
    goto :goto_2

    .line 94
    :goto_3
    invoke-static {p3, v0}, Ljava/lang/Math;->max(II)I

    .line 95
    .line 96
    .line 97
    move-result p2

    .line 98
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 99
    .line 100
    .line 101
    move-result p3

    .line 102
    if-ltz v2, :cond_d

    .line 103
    .line 104
    if-ge p3, v2, :cond_c

    .line 105
    .line 106
    goto :goto_4

    .line 107
    :cond_c
    if-gez p2, :cond_e

    .line 108
    .line 109
    :cond_d
    :goto_4
    move p3, v3

    .line 110
    goto :goto_7

    .line 111
    :cond_e
    :goto_5
    move p4, v0

    .line 112
    :goto_6
    if-nez p2, :cond_f

    .line 113
    .line 114
    move p3, v2

    .line 115
    goto :goto_7

    .line 116
    :cond_f
    if-lt v2, p3, :cond_10

    .line 117
    .line 118
    if-eqz p4, :cond_15

    .line 119
    .line 120
    goto :goto_4

    .line 121
    :cond_10
    invoke-interface {p1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 122
    .line 123
    .line 124
    move-result v5

    .line 125
    if-eqz p4, :cond_12

    .line 126
    .line 127
    invoke-static {v5}, Ljava/lang/Character;->isLowSurrogate(C)Z

    .line 128
    .line 129
    .line 130
    move-result p4

    .line 131
    if-nez p4, :cond_11

    .line 132
    .line 133
    goto :goto_4

    .line 134
    :cond_11
    add-int/lit8 p2, p2, -0x1

    .line 135
    .line 136
    add-int/lit8 v2, v2, 0x1

    .line 137
    .line 138
    goto :goto_5

    .line 139
    :cond_12
    invoke-static {v5}, Ljava/lang/Character;->isSurrogate(C)Z

    .line 140
    .line 141
    .line 142
    move-result v6

    .line 143
    if-nez v6, :cond_13

    .line 144
    .line 145
    add-int/lit8 p2, p2, -0x1

    .line 146
    .line 147
    add-int/lit8 v2, v2, 0x1

    .line 148
    .line 149
    goto :goto_6

    .line 150
    :cond_13
    invoke-static {v5}, Ljava/lang/Character;->isLowSurrogate(C)Z

    .line 151
    .line 152
    .line 153
    move-result p4

    .line 154
    if-eqz p4, :cond_14

    .line 155
    .line 156
    goto :goto_4

    .line 157
    :cond_14
    add-int/lit8 v2, v2, 0x1

    .line 158
    .line 159
    move p4, v4

    .line 160
    goto :goto_6

    .line 161
    :cond_15
    :goto_7
    if-eq v1, v3, :cond_19

    .line 162
    .line 163
    if-ne p3, v3, :cond_17

    .line 164
    .line 165
    goto :goto_9

    .line 166
    :cond_16
    sub-int/2addr v1, p2

    .line 167
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 168
    .line 169
    .line 170
    move-result v1

    .line 171
    add-int/2addr v2, p3

    .line 172
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 173
    .line 174
    .line 175
    move-result p2

    .line 176
    invoke-static {v2, p2}, Ljava/lang/Math;->min(II)I

    .line 177
    .line 178
    .line 179
    move-result p3

    .line 180
    :cond_17
    const-class p2, Lpj8;

    .line 181
    .line 182
    invoke-interface {p1, v1, p3, p2}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object p2

    .line 186
    check-cast p2, [Lpj8;

    .line 187
    .line 188
    if-eqz p2, :cond_19

    .line 189
    .line 190
    array-length p4, p2

    .line 191
    if-lez p4, :cond_19

    .line 192
    .line 193
    array-length p4, p2

    .line 194
    move v2, v0

    .line 195
    :goto_8
    if-ge v2, p4, :cond_18

    .line 196
    .line 197
    aget-object v3, p2, v2

    .line 198
    .line 199
    invoke-interface {p1, v3}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    .line 200
    .line 201
    .line 202
    move-result v5

    .line 203
    invoke-interface {p1, v3}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    .line 204
    .line 205
    .line 206
    move-result v3

    .line 207
    invoke-static {v5, v1}, Ljava/lang/Math;->min(II)I

    .line 208
    .line 209
    .line 210
    move-result v1

    .line 211
    invoke-static {v3, p3}, Ljava/lang/Math;->max(II)I

    .line 212
    .line 213
    .line 214
    move-result p3

    .line 215
    add-int/lit8 v2, v2, 0x1

    .line 216
    .line 217
    goto :goto_8

    .line 218
    :cond_18
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 219
    .line 220
    .line 221
    move-result p2

    .line 222
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 223
    .line 224
    .line 225
    move-result p4

    .line 226
    invoke-static {p3, p4}, Ljava/lang/Math;->min(II)I

    .line 227
    .line 228
    .line 229
    move-result p3

    .line 230
    invoke-virtual {p0}, Landroid/view/inputmethod/InputConnectionWrapper;->beginBatchEdit()Z

    .line 231
    .line 232
    .line 233
    invoke-interface {p1, p2, p3}, Landroid/text/Editable;->delete(II)Landroid/text/Editable;

    .line 234
    .line 235
    .line 236
    invoke-virtual {p0}, Landroid/view/inputmethod/InputConnectionWrapper;->endBatchEdit()Z

    .line 237
    .line 238
    .line 239
    return v4

    .line 240
    :cond_19
    :goto_9
    return v0
.end method


# virtual methods
.method public A(Lsm0;)V
    .locals 0

    .line 1
    iget-object p0, p0, Llr;->f0:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lum0;

    .line 4
    .line 5
    iget-object p0, p0, Lum0;->X:Ltm0;

    .line 6
    .line 7
    iput-object p1, p0, Ltm0;->c:Lsm0;

    .line 8
    .line 9
    return-void
.end method

.method public B(Lfi1;)V
    .locals 0

    .line 1
    iget-object p0, p0, Llr;->f0:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lum0;

    .line 4
    .line 5
    iget-object p0, p0, Lum0;->X:Ltm0;

    .line 6
    .line 7
    iput-object p1, p0, Ltm0;->a:Lfi1;

    .line 8
    .line 9
    return-void
.end method

.method public C(Lz24;)V
    .locals 0

    .line 1
    iget-object p0, p0, Llr;->f0:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lum0;

    .line 4
    .line 5
    iget-object p0, p0, Lum0;->X:Ltm0;

    .line 6
    .line 7
    iput-object p1, p0, Ltm0;->b:Lz24;

    .line 8
    .line 9
    return-void
.end method

.method public D(J)V
    .locals 0

    .line 1
    iget-object p0, p0, Llr;->f0:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lum0;

    .line 4
    .line 5
    iget-object p0, p0, Lum0;->X:Ltm0;

    .line 6
    .line 7
    iput-wide p1, p0, Ltm0;->d:J

    .line 8
    .line 9
    return-void
.end method

.method public E(Ln31;III)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p1, Lm31;->b0:I

    .line 5
    .line 6
    iget v1, p1, Lm31;->c0:I

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    iput v2, p1, Lm31;->b0:I

    .line 10
    .line 11
    iput v2, p1, Lm31;->c0:I

    .line 12
    .line 13
    invoke-virtual {p1, p3}, Lm31;->O(I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, p4}, Lm31;->L(I)V

    .line 17
    .line 18
    .line 19
    if-gez v0, :cond_0

    .line 20
    .line 21
    iput v2, p1, Lm31;->b0:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iput v0, p1, Lm31;->b0:I

    .line 25
    .line 26
    :goto_0
    if-gez v1, :cond_1

    .line 27
    .line 28
    iput v2, p1, Lm31;->c0:I

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    iput v1, p1, Lm31;->c0:I

    .line 32
    .line 33
    :goto_1
    iget-object p0, p0, Llr;->f0:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p0, Ln31;

    .line 36
    .line 37
    iput p2, p0, Ln31;->t0:I

    .line 38
    .line 39
    invoke-virtual {p0}, Ln31;->U()V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public F(Ln31;)V
    .locals 8

    .line 1
    iget-object p0, p0, Llr;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/util/ArrayList;->clear()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p1, Ln31;->q0:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x0

    .line 15
    move v2, v1

    .line 16
    :goto_0
    const/4 v3, 0x1

    .line 17
    if-ge v2, v0, :cond_2

    .line 18
    .line 19
    iget-object v4, p1, Ln31;->q0:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    check-cast v4, Lm31;

    .line 26
    .line 27
    iget-object v5, v4, Lm31;->p0:[I

    .line 28
    .line 29
    aget v6, v5, v1

    .line 30
    .line 31
    const/4 v7, 0x3

    .line 32
    if-eq v6, v7, :cond_0

    .line 33
    .line 34
    aget v3, v5, v3

    .line 35
    .line 36
    if-ne v3, v7, :cond_1

    .line 37
    .line 38
    :cond_0
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    iget-object p0, p1, Ln31;->s0:Lri1;

    .line 45
    .line 46
    iput-boolean v3, p0, Lri1;->a:Z

    .line 47
    .line 48
    return-void
.end method

.method public a(Landroidx/compose/ui/node/LayoutNode;Lbi3;)V
    .locals 3

    .line 1
    iget-object v0, p0, Llr;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lyr2;

    .line 4
    .line 5
    iget-object v1, p0, Llr;->Z:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lyr2;

    .line 8
    .line 9
    iget-object p0, p0, Llr;->f0:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Lyr2;

    .line 12
    .line 13
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    if-eqz p2, :cond_5

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    if-eq p2, v2, :cond_4

    .line 21
    .line 22
    const/4 v2, 0x2

    .line 23
    if-eq p2, v2, :cond_2

    .line 24
    .line 25
    const/4 v0, 0x3

    .line 26
    if-ne p2, v0, :cond_1

    .line 27
    .line 28
    iget-object p2, p1, Landroidx/compose/ui/node/LayoutNode;->k0:Landroidx/compose/ui/node/LayoutNode;

    .line 29
    .line 30
    if-eqz p2, :cond_0

    .line 31
    .line 32
    invoke-virtual {p0, p1}, Lyr2;->d(Landroidx/compose/ui/node/LayoutNode;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_0
    invoke-virtual {v1, p1}, Lyr2;->d(Landroidx/compose/ui/node/LayoutNode;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_1
    invoke-static {}, Lb61;->c()V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_2
    iget-object p2, p1, Landroidx/compose/ui/node/LayoutNode;->k0:Landroidx/compose/ui/node/LayoutNode;

    .line 45
    .line 46
    if-eqz p2, :cond_3

    .line 47
    .line 48
    invoke-virtual {p0, p1}, Lyr2;->d(Landroidx/compose/ui/node/LayoutNode;)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_3
    invoke-virtual {v0, p1}, Lyr2;->d(Landroidx/compose/ui/node/LayoutNode;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_4
    invoke-virtual {v1, p1}, Lyr2;->d(Landroidx/compose/ui/node/LayoutNode;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0, p1}, Lyr2;->d(Landroidx/compose/ui/node/LayoutNode;)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_5
    invoke-virtual {v0, p1}, Lyr2;->d(Landroidx/compose/ui/node/LayoutNode;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, p1}, Lyr2;->d(Landroidx/compose/ui/node/LayoutNode;)V

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method public b(Ljava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p1, Landroid/view/Surface;

    .line 2
    .line 3
    iget-object p1, p0, Llr;->Y:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, Lxb4;

    .line 6
    .line 7
    iget-object p0, p0, Llr;->Z:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Lqd0;

    .line 10
    .line 11
    invoke-static {}, Ldp1;->a()Ldp1;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/4 v1, 0x1

    .line 16
    invoke-static {v1, p1, p0, v0}, Lvr3;->T(ZLxb4;Lqd0;Ldp1;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public c(Lf57;)Z
    .locals 10

    .line 1
    new-instance v0, Lmi0;

    .line 2
    .line 3
    new-instance v1, Lwg0;

    .line 4
    .line 5
    invoke-direct {v1}, Lwg0;-><init>()V

    .line 6
    .line 7
    .line 8
    new-instance v2, Llx0;

    .line 9
    .line 10
    invoke-direct {v2}, Llx0;-><init>()V

    .line 11
    .line 12
    .line 13
    new-instance v3, Ljh0;

    .line 14
    .line 15
    iget-object v4, p0, Llr;->Y:Ljava/lang/Object;

    .line 16
    .line 17
    move-object v7, v4

    .line 18
    check-cast v7, Ljj0;

    .line 19
    .line 20
    move-object v4, v7

    .line 21
    check-cast v4, Llf0;

    .line 22
    .line 23
    iget-object v4, v4, Llf0;->X:Ljava/lang/String;

    .line 24
    .line 25
    invoke-direct {v3, v4}, Ljh0;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    iget-object v4, p0, Llr;->f0:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v4, Lik0;

    .line 31
    .line 32
    new-instance v5, Lv79;

    .line 33
    .line 34
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    new-instance v6, Ll28;

    .line 38
    .line 39
    invoke-virtual {v4}, Lik0;->a()Li26;

    .line 40
    .line 41
    .line 42
    move-result-object v8

    .line 43
    invoke-direct {v6, v8}, Ll28;-><init>(Li26;)V

    .line 44
    .line 45
    .line 46
    const/4 v8, 0x0

    .line 47
    const/4 v9, 0x0

    .line 48
    invoke-direct/range {v0 .. v9}, Lmi0;-><init>(Lwg0;Llx0;Ljh0;Lik0;Lt79;Lk28;Ljj0;Lbm0;Ldq;)V

    .line 49
    .line 50
    .line 51
    const/4 v3, 0x1

    .line 52
    sget-object v6, Le02;->X:Le02;

    .line 53
    .line 54
    const/4 v1, 0x0

    .line 55
    const/4 v4, 0x0

    .line 56
    const/4 v5, 0x0

    .line 57
    move-object v7, v6

    .line 58
    move-object v2, p1

    .line 59
    invoke-virtual/range {v0 .. v7}, Lmi0;->a(ILf57;ZLst2;Ljava/lang/Integer;Ljava/util/Map;Ljava/util/Map;)Lli0;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    new-instance v0, Lq0;

    .line 64
    .line 65
    const/16 v1, 0x17

    .line 66
    .line 67
    const/4 v2, 0x0

    .line 68
    invoke-direct {v0, p0, p1, v2, v1}, Lq0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 69
    .line 70
    .line 71
    sget-object p0, Lb02;->X:Lb02;

    .line 72
    .line 73
    invoke-static {p0, v0}, Lz51;->R(Ls61;Lrn2;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    check-cast p0, Ljava/lang/Boolean;

    .line 78
    .line 79
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 80
    .line 81
    .line 82
    move-result p0

    .line 83
    return p0
.end method

.method public d()V
    .locals 1

    .line 1
    iget-object p0, p0, Llr;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lzz2;

    .line 4
    .line 5
    iget-object p0, p0, Lzz2;->Z:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lsu/happ/proxyutility/ui/foundation/component/HappEditText;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    invoke-virtual {p0, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public e()Lqz;
    .locals 3

    .line 1
    iget-object v0, p0, Llr;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/String;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, " backendName"

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const-string v0, ""

    .line 11
    .line 12
    :goto_0
    iget-object v1, p0, Llr;->f0:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Lfu5;

    .line 15
    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    const-string v1, " priority"

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_2

    .line 29
    .line 30
    new-instance v0, Lqz;

    .line 31
    .line 32
    iget-object v1, p0, Llr;->Y:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v1, Ljava/lang/String;

    .line 35
    .line 36
    iget-object v2, p0, Llr;->Z:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v2, [B

    .line 39
    .line 40
    iget-object p0, p0, Llr;->f0:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p0, Lfu5;

    .line 43
    .line 44
    invoke-direct {v0, v1, v2, p0}, Lqz;-><init>(Ljava/lang/String;[BLfu5;)V

    .line 45
    .line 46
    .line 47
    return-object v0

    .line 48
    :cond_2
    const-string p0, "Missing required properties:"

    .line 49
    .line 50
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    const/4 p0, 0x0

    .line 58
    return-object p0
.end method

.method public f(Landroidx/compose/ui/node/LayoutNode;)Z
    .locals 4

    .line 1
    iget-object v0, p1, Landroidx/compose/ui/node/LayoutNode;->k0:Landroidx/compose/ui/node/LayoutNode;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    move v0, v2

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v0, v1

    .line 10
    :goto_0
    iget-object v3, p0, Llr;->Y:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v3, Lyr2;

    .line 13
    .line 14
    iget-object v3, v3, Lyr2;->Y:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v3, Lhe7;

    .line 17
    .line 18
    invoke-virtual {v3, p1}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-nez v3, :cond_2

    .line 23
    .line 24
    iget-object p0, p0, Llr;->Z:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p0, Lyr2;

    .line 27
    .line 28
    iget-object p0, p0, Lyr2;->Y:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p0, Lhe7;

    .line 31
    .line 32
    invoke-virtual {p0, p1}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    if-eqz p0, :cond_1

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    move p0, v1

    .line 40
    goto :goto_2

    .line 41
    :cond_2
    :goto_1
    move p0, v2

    .line 42
    :goto_2
    if-nez v0, :cond_3

    .line 43
    .line 44
    if-eqz p0, :cond_3

    .line 45
    .line 46
    return v2

    .line 47
    :cond_3
    return v1
.end method

.method public getRoot()Landroid/view/View;
    .locals 1

    .line 1
    iget-byte v0, p0, Llr;->X:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Llr;->Y:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 9
    .line 10
    return-object p0

    .line 11
    :pswitch_0
    iget-object p0, p0, Llr;->Y:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Landroid/widget/FrameLayout;

    .line 14
    .line 15
    return-object p0

    .line 16
    :pswitch_1
    iget-object p0, p0, Llr;->Y:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, Landroid/widget/LinearLayout;

    .line 19
    .line 20
    return-object p0

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public h(Landroid/os/Bundle;)V
    .locals 6

    .line 1
    iget-object v0, p0, Llr;->Z:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashSet;

    .line 4
    .line 5
    iget-object v1, p0, Llr;->f0:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroid/content/Context;

    .line 8
    .line 9
    sget v2, Le56;->androidx_startup:I

    .line 10
    .line 11
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-eqz p1, :cond_2

    .line 16
    .line 17
    :try_start_0
    new-instance v2, Ljava/util/HashSet;

    .line 18
    .line 19
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    if-eqz v4, :cond_1

    .line 35
    .line 36
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    check-cast v4, Ljava/lang/String;

    .line 41
    .line 42
    const/4 v5, 0x0

    .line 43
    invoke-virtual {p1, v4, v5}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    if-eqz v5, :cond_0

    .line 52
    .line 53
    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    const-class v5, Lrc3;

    .line 58
    .line 59
    invoke-virtual {v5, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    if-eqz v5, :cond_0

    .line 64
    .line 65
    invoke-virtual {v0, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_1
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-eqz v0, :cond_2

    .line 78
    .line 79
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    check-cast v0, Ljava/lang/Class;

    .line 84
    .line 85
    invoke-virtual {p0, v0, v2}, Llr;->i(Ljava/lang/Class;Ljava/util/HashSet;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :catch_0
    move-exception p0

    .line 90
    new-instance p1, Lgh7;

    .line 91
    .line 92
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 93
    .line 94
    .line 95
    throw p1

    .line 96
    :cond_2
    return-void
.end method

.method public i(Ljava/lang/Class;Ljava/util/HashSet;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Llr;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashMap;

    .line 4
    .line 5
    const-string v1, "Cannot initialize "

    .line 6
    .line 7
    invoke-static {}, Lln7;->c()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_1

    .line 12
    .line 13
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    const/16 v4, 0x7f

    .line 22
    .line 23
    if-gt v3, v4, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v3, 0x0

    .line 27
    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    :goto_0
    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    :cond_1
    invoke-virtual {p2, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-nez v2, :cond_5

    .line 39
    .line 40
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-nez v1, :cond_4

    .line 45
    .line 46
    invoke-virtual {p2, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 47
    .line 48
    .line 49
    const/4 v1, 0x0

    .line 50
    :try_start_1
    invoke-virtual {p1, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-virtual {v2, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    check-cast v1, Lrc3;

    .line 59
    .line 60
    invoke-interface {v1}, Lrc3;->dependencies()Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-nez v3, :cond_3

    .line 69
    .line 70
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    if-eqz v3, :cond_3

    .line 79
    .line 80
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    check-cast v3, Ljava/lang/Class;

    .line 85
    .line 86
    invoke-virtual {v0, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    if-nez v4, :cond_2

    .line 91
    .line 92
    invoke-virtual {p0, v3, p2}, Llr;->i(Ljava/lang/Class;Ljava/util/HashSet;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_3
    iget-object p0, p0, Llr;->f0:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast p0, Landroid/content/Context;

    .line 99
    .line 100
    invoke-interface {v1, p0}, Lrc3;->create(Landroid/content/Context;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    invoke-virtual {p2, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0, p1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 108
    .line 109
    .line 110
    goto :goto_2

    .line 111
    :catchall_0
    move-exception p0

    .line 112
    :try_start_2
    new-instance p1, Lgh7;

    .line 113
    .line 114
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 115
    .line 116
    .line 117
    throw p1

    .line 118
    :cond_4
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 122
    :goto_2
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 123
    .line 124
    .line 125
    return-object p0

    .line 126
    :cond_5
    :try_start_3
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    new-instance p1, Ljava/lang/StringBuilder;

    .line 131
    .line 132
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    const-string p0, ". Cycle detected."

    .line 139
    .line 140
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 148
    .line 149
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 153
    :catchall_1
    move-exception p0

    .line 154
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 155
    .line 156
    .line 157
    throw p0
.end method

.method public j()V
    .locals 3

    .line 1
    iget-object v0, p0, Llr;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lzz2;

    .line 4
    .line 5
    iget-object v0, v0, Lzz2;->Z:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lsu/happ/proxyutility/ui/foundation/component/HappEditText;

    .line 8
    .line 9
    new-instance v1, Li81;

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    invoke-direct {v1, p0, v2}, Li81;-><init>(Ljava/lang/Object;B)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1}, Lx97;->U(Landroid/view/View;Lh91;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public k()Lsm0;
    .locals 0

    .line 1
    iget-object p0, p0, Llr;->f0:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lum0;

    .line 4
    .line 5
    iget-object p0, p0, Lum0;->X:Ltm0;

    .line 6
    .line 7
    iget-object p0, p0, Ltm0;->c:Lsm0;

    .line 8
    .line 9
    return-object p0
.end method

.method public l()Lge4;
    .locals 7

    .line 1
    invoke-static {}, Landroid/os/LocaleList;->getDefault()Landroid/os/LocaleList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Llr;->f0:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lg55;

    .line 8
    .line 9
    monitor-enter v1

    .line 10
    :try_start_0
    iget-object v2, p0, Llr;->Z:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v2, Lge4;

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    iget-object v3, p0, Llr;->Y:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v3, Landroid/os/LocaleList;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    if-ne v0, v3, :cond_0

    .line 21
    .line 22
    monitor-exit v1

    .line 23
    return-object v2

    .line 24
    :cond_0
    :try_start_1
    invoke-virtual {v0}, Landroid/os/LocaleList;->size()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    new-instance v3, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 31
    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    :goto_0
    if-ge v4, v2, :cond_1

    .line 35
    .line 36
    new-instance v5, Lce4;

    .line 37
    .line 38
    invoke-virtual {v0, v4}, Landroid/os/LocaleList;->get(I)Ljava/util/Locale;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    invoke-direct {v5, v6}, Lce4;-><init>(Ljava/util/Locale;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    add-int/lit8 v4, v4, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :catchall_0
    move-exception p0

    .line 52
    goto :goto_1

    .line 53
    :cond_1
    new-instance v2, Lge4;

    .line 54
    .line 55
    invoke-direct {v2, v3}, Lge4;-><init>(Ljava/util/List;)V

    .line 56
    .line 57
    .line 58
    iput-object v0, p0, Llr;->Y:Ljava/lang/Object;

    .line 59
    .line 60
    iput-object v2, p0, Llr;->Z:Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 61
    .line 62
    monitor-exit v1

    .line 63
    return-object v2

    .line 64
    :goto_1
    monitor-exit v1

    .line 65
    throw p0
.end method

.method public m()Lfi1;
    .locals 0

    .line 1
    iget-object p0, p0, Llr;->f0:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lum0;

    .line 4
    .line 5
    iget-object p0, p0, Lum0;->X:Ltm0;

    .line 6
    .line 7
    iget-object p0, p0, Ltm0;->a:Lfi1;

    .line 8
    .line 9
    return-object p0
.end method

.method public o()Lz24;
    .locals 0

    .line 1
    iget-object p0, p0, Llr;->f0:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lum0;

    .line 4
    .line 5
    iget-object p0, p0, Lum0;->X:Ltm0;

    .line 6
    .line 7
    iget-object p0, p0, Ltm0;->b:Lz24;

    .line 8
    .line 9
    return-object p0
.end method

.method public p()J
    .locals 2

    .line 1
    iget-object p0, p0, Llr;->f0:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lum0;

    .line 4
    .line 5
    iget-object p0, p0, Lum0;->X:Ltm0;

    .line 6
    .line 7
    iget-wide v0, p0, Ltm0;->d:J

    .line 8
    .line 9
    return-wide v0
.end method

.method public q()Lov8;
    .locals 0

    .line 1
    iget-object p0, p0, Llr;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lzz2;

    .line 4
    .line 5
    return-object p0
.end method

.method public s()Z
    .locals 9

    .line 1
    iget-object v0, p0, Llr;->f0:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lq02;

    .line 4
    .line 5
    const-string v1, "gcm.n.noui"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lq02;->F(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x1

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    return v1

    .line 15
    :cond_0
    iget-object v0, p0, Llr;->Z:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lcom/google/firebase/messaging/FirebaseMessagingService;

    .line 18
    .line 19
    const-string v2, "keyguard"

    .line 20
    .line 21
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Landroid/app/KeyguardManager;

    .line 26
    .line 27
    invoke-virtual {v2}, Landroid/app/KeyguardManager;->inKeyguardRestrictedInputMode()Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    const/4 v3, 0x0

    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    const-string v4, "activity"

    .line 40
    .line 41
    invoke-virtual {v0, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, Landroid/app/ActivityManager;

    .line 46
    .line 47
    invoke-virtual {v0}, Landroid/app/ActivityManager;->getRunningAppProcesses()Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    if-eqz v0, :cond_3

    .line 52
    .line 53
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    if-eqz v4, :cond_3

    .line 62
    .line 63
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    check-cast v4, Landroid/app/ActivityManager$RunningAppProcessInfo;

    .line 68
    .line 69
    iget v5, v4, Landroid/app/ActivityManager$RunningAppProcessInfo;->pid:I

    .line 70
    .line 71
    if-ne v5, v2, :cond_2

    .line 72
    .line 73
    iget v0, v4, Landroid/app/ActivityManager$RunningAppProcessInfo;->importance:I

    .line 74
    .line 75
    const/16 v2, 0x64

    .line 76
    .line 77
    if-ne v0, v2, :cond_3

    .line 78
    .line 79
    return v3

    .line 80
    :cond_3
    :goto_0
    iget-object v0, p0, Llr;->f0:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v0, Lq02;

    .line 83
    .line 84
    const-string v2, "gcm.n.image"

    .line 85
    .line 86
    invoke-virtual {v0, v2}, Lq02;->M(Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    const/4 v4, 0x0

    .line 95
    if-eqz v2, :cond_4

    .line 96
    .line 97
    :catch_0
    move-object v2, v4

    .line 98
    goto :goto_1

    .line 99
    :cond_4
    :try_start_0
    new-instance v2, La63;

    .line 100
    .line 101
    new-instance v5, Ljava/net/URL;

    .line 102
    .line 103
    invoke-direct {v5, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    invoke-direct {v2, v5}, La63;-><init>(Ljava/net/URL;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 107
    .line 108
    .line 109
    :goto_1
    if-eqz v2, :cond_5

    .line 110
    .line 111
    iget-object v0, p0, Llr;->Y:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v0, Ljava/util/concurrent/ExecutorService;

    .line 114
    .line 115
    new-instance v5, Lz18;

    .line 116
    .line 117
    invoke-direct {v5}, Lz18;-><init>()V

    .line 118
    .line 119
    .line 120
    new-instance v6, Lsc;

    .line 121
    .line 122
    const/16 v7, 0x1b

    .line 123
    .line 124
    invoke-direct {v6, v2, v5, v7}, Lsc;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 125
    .line 126
    .line 127
    invoke-interface {v0, v6}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    iput-object v0, v2, La63;->Y:Ljava/util/concurrent/Future;

    .line 132
    .line 133
    iget-object v0, v5, Lz18;->a:Lfb9;

    .line 134
    .line 135
    iput-object v0, v2, La63;->Z:Lfb9;

    .line 136
    .line 137
    :cond_5
    iget-object v0, p0, Llr;->Z:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v0, Lcom/google/firebase/messaging/FirebaseMessagingService;

    .line 140
    .line 141
    iget-object v5, p0, Llr;->f0:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v5, Lq02;

    .line 144
    .line 145
    invoke-static {v0, v5}, Lox0;->a(Lcom/google/firebase/messaging/FirebaseMessagingService;Lq02;)Lmj0;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    iget-object v5, v0, Lmj0;->Y:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v5, Lr65;

    .line 152
    .line 153
    if-nez v2, :cond_6

    .line 154
    .line 155
    goto :goto_4

    .line 156
    :cond_6
    :try_start_1
    iget-object v6, v2, La63;->Z:Lfb9;

    .line 157
    .line 158
    invoke-static {v6}, Lw45;->s(Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    const-wide/16 v7, 0x5

    .line 162
    .line 163
    invoke-static {v6, v7, v8}, Lg28;->c(Lfb9;J)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v6

    .line 167
    check-cast v6, Landroid/graphics/Bitmap;

    .line 168
    .line 169
    invoke-virtual {v5, v6}, Lr65;->e(Landroid/graphics/Bitmap;)V

    .line 170
    .line 171
    .line 172
    new-instance v7, Lp65;

    .line 173
    .line 174
    invoke-direct {v7}, Ls65;-><init>()V

    .line 175
    .line 176
    .line 177
    if-nez v6, :cond_7

    .line 178
    .line 179
    move-object v8, v4

    .line 180
    goto :goto_2

    .line 181
    :cond_7
    new-instance v8, Landroidx/core/graphics/drawable/IconCompat;

    .line 182
    .line 183
    invoke-direct {v8, v1}, Landroidx/core/graphics/drawable/IconCompat;-><init>(I)V

    .line 184
    .line 185
    .line 186
    iput-object v6, v8, Landroidx/core/graphics/drawable/IconCompat;->b:Ljava/lang/Object;

    .line 187
    .line 188
    :goto_2
    iput-object v8, v7, Lp65;->e:Landroidx/core/graphics/drawable/IconCompat;

    .line 189
    .line 190
    iput-object v4, v7, Lp65;->f:Landroidx/core/graphics/drawable/IconCompat;

    .line 191
    .line 192
    iput-boolean v1, v7, Lp65;->g:Z

    .line 193
    .line 194
    invoke-virtual {v5, v7}, Lr65;->f(Ls65;)V
    :try_end_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_1 .. :try_end_1} :catch_2

    .line 195
    .line 196
    .line 197
    goto :goto_4

    .line 198
    :catch_1
    move-exception v2

    .line 199
    goto :goto_3

    .line 200
    :catch_2
    invoke-virtual {v2}, La63;->close()V

    .line 201
    .line 202
    .line 203
    goto :goto_4

    .line 204
    :catch_3
    invoke-virtual {v2}, La63;->close()V

    .line 205
    .line 206
    .line 207
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    invoke-virtual {v2}, Ljava/lang/Thread;->interrupt()V

    .line 212
    .line 213
    .line 214
    goto :goto_4

    .line 215
    :goto_3
    invoke-virtual {v2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    invoke-static {v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    :goto_4
    iget-object p0, p0, Llr;->Z:Ljava/lang/Object;

    .line 223
    .line 224
    check-cast p0, Lcom/google/firebase/messaging/FirebaseMessagingService;

    .line 225
    .line 226
    const-string v2, "notification"

    .line 227
    .line 228
    invoke-virtual {p0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object p0

    .line 232
    check-cast p0, Landroid/app/NotificationManager;

    .line 233
    .line 234
    iget-object v2, v0, Lmj0;->Z:Ljava/lang/Object;

    .line 235
    .line 236
    check-cast v2, Ljava/lang/String;

    .line 237
    .line 238
    iget-object v0, v0, Lmj0;->Y:Ljava/lang/Object;

    .line 239
    .line 240
    check-cast v0, Lr65;

    .line 241
    .line 242
    invoke-virtual {v0}, Lr65;->b()Landroid/app/Notification;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    invoke-virtual {p0, v2, v3, v0}, Landroid/app/NotificationManager;->notify(Ljava/lang/String;ILandroid/app/Notification;)V

    .line 247
    .line 248
    .line 249
    return v1
.end method

.method public t(Lqd0;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Lxb;

    .line 2
    .line 3
    const/16 v1, 0xd

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, Lxb;-><init>(Ljava/lang/Object;B)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Ldp1;->a()Ldp1;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {p1, v0, v1}, Lqd0;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Llr;->f0:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lkv2;

    .line 18
    .line 19
    iget-object v0, v0, Lkv2;->X:Ljava/util/concurrent/atomic/AtomicReference;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    new-instance p1, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    const-string v0, "HandlerScheduledFuture-"

    .line 27
    .line 28
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    iget-object p0, p0, Llr;->Z:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p0, Ljava/util/concurrent/Callable;

    .line 34
    .line 35
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget-byte v0, p0, Llr;->X:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v1, "[ClassStack (self-refs: "

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Llr;->f0:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Ljava/util/ArrayList;

    .line 21
    .line 22
    if-nez v1, :cond_0

    .line 23
    .line 24
    const-string v1, "0"

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const/16 v1, 0x29

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    :goto_1
    if-eqz p0, :cond_1

    .line 44
    .line 45
    const/16 v1, 0x20

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    iget-object v1, p0, Llr;->Z:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v1, Ljava/lang/Class;

    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    iget-object p0, p0, Llr;->Y:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast p0, Llr;

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_1
    const/16 p0, 0x5d

    .line 67
    .line 68
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    return-object p0

    .line 76
    nop

    .line 77
    :pswitch_data_0
    .packed-switch 0x12
        :pswitch_0
    .end packed-switch
.end method

.method public u(Ljava/lang/Throwable;)V
    .locals 4

    .line 1
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    .line 2
    .line 3
    iget-object v1, p0, Llr;->Z:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lqd0;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Lfy7;

    .line 11
    .line 12
    iget-object p0, p0, Llr;->f0:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Ljava/lang/String;

    .line 15
    .line 16
    const-string v3, " cancelled."

    .line 17
    .line 18
    invoke-virtual {p0, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-direct {v0, p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v0}, Lqd0;->d(Ljava/lang/Throwable;)Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    invoke-static {v2, p0}, Lmb6;->s(Ljava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    invoke-virtual {v1, v2}, Lqd0;->b(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public v(Ljava/lang/CharSequence;IILoj8;)Z
    .locals 6

    .line 1
    iget v0, p4, Loj8;->c:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x3

    .line 4
    .line 5
    const/4 v1, 0x2

    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x1

    .line 8
    if-nez v0, :cond_4

    .line 9
    .line 10
    iget-object p0, p0, Llr;->f0:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Lre1;

    .line 13
    .line 14
    invoke-virtual {p4}, Loj8;->b()Ldv4;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/16 v4, 0x8

    .line 19
    .line 20
    invoke-virtual {v0, v4}, Lhp4;->a(I)I

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-eqz v4, :cond_0

    .line 25
    .line 26
    iget-object v5, v0, Lhp4;->f0:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v5, Ljava/nio/ByteBuffer;

    .line 29
    .line 30
    iget v0, v0, Lhp4;->X:I

    .line 31
    .line 32
    add-int/2addr v4, v0

    .line 33
    invoke-virtual {v5, v4}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 34
    .line 35
    .line 36
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    sget-object v0, Lre1;->b:Ljava/lang/ThreadLocal;

    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    if-nez v4, :cond_1

    .line 46
    .line 47
    new-instance v4, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v4}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    check-cast v0, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 62
    .line 63
    .line 64
    :goto_0
    if-ge p2, p3, :cond_2

    .line 65
    .line 66
    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    add-int/lit8 p2, p2, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_2
    iget-object p0, p0, Lre1;->a:Landroid/text/TextPaint;

    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->hasGlyph(Ljava/lang/String;)Z

    .line 83
    .line 84
    .line 85
    move-result p0

    .line 86
    iget p1, p4, Loj8;->c:I

    .line 87
    .line 88
    and-int/lit8 p1, p1, 0x4

    .line 89
    .line 90
    if-eqz p0, :cond_3

    .line 91
    .line 92
    or-int/lit8 p0, p1, 0x2

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_3
    or-int/lit8 p0, p1, 0x1

    .line 96
    .line 97
    :goto_1
    iput p0, p4, Loj8;->c:I

    .line 98
    .line 99
    :cond_4
    iget p0, p4, Loj8;->c:I

    .line 100
    .line 101
    and-int/lit8 p0, p0, 0x3

    .line 102
    .line 103
    if-ne p0, v1, :cond_5

    .line 104
    .line 105
    return v3

    .line 106
    :cond_5
    return v2
.end method

.method public w()Z
    .locals 2

    .line 1
    iget-object v0, p0, Llr;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lyr2;

    .line 4
    .line 5
    iget-object v0, v0, Lyr2;->Y:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lhe7;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x1

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Llr;->f0:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lyr2;

    .line 19
    .line 20
    iget-object v0, v0, Lyr2;->Y:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Lhe7;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    iget-object p0, p0, Llr;->Z:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p0, Lyr2;

    .line 33
    .line 34
    iget-object p0, p0, Lyr2;->Y:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p0, Lhe7;

    .line 37
    .line 38
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    if-eqz p0, :cond_0

    .line 43
    .line 44
    move p0, v1

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    const/4 p0, 0x0

    .line 47
    :goto_0
    xor-int/2addr p0, v1

    .line 48
    return p0
.end method

.method public x(ILe30;Lm31;)Z
    .locals 5

    .line 1
    iget-object p0, p0, Llr;->Z:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ld30;

    .line 4
    .line 5
    iget-object v0, p3, Lm31;->p0:[I

    .line 6
    .line 7
    iget-object v1, p3, Lm31;->t:[I

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    aget v3, v0, v2

    .line 11
    .line 12
    iput v3, p0, Ld30;->a:I

    .line 13
    .line 14
    const/4 v3, 0x1

    .line 15
    aget v0, v0, v3

    .line 16
    .line 17
    iput v0, p0, Ld30;->b:I

    .line 18
    .line 19
    invoke-virtual {p3}, Lm31;->q()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    iput v0, p0, Ld30;->c:I

    .line 24
    .line 25
    invoke-virtual {p3}, Lm31;->k()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    iput v0, p0, Ld30;->d:I

    .line 30
    .line 31
    iput-boolean v2, p0, Ld30;->i:Z

    .line 32
    .line 33
    iput p1, p0, Ld30;->j:I

    .line 34
    .line 35
    iget p1, p0, Ld30;->a:I

    .line 36
    .line 37
    const/4 v0, 0x3

    .line 38
    if-ne p1, v0, :cond_0

    .line 39
    .line 40
    move p1, v3

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    move p1, v2

    .line 43
    :goto_0
    iget v4, p0, Ld30;->b:I

    .line 44
    .line 45
    if-ne v4, v0, :cond_1

    .line 46
    .line 47
    move v0, v3

    .line 48
    goto :goto_1

    .line 49
    :cond_1
    move v0, v2

    .line 50
    :goto_1
    const/4 v4, 0x0

    .line 51
    if-eqz p1, :cond_2

    .line 52
    .line 53
    iget p1, p3, Lm31;->W:F

    .line 54
    .line 55
    cmpl-float p1, p1, v4

    .line 56
    .line 57
    if-lez p1, :cond_2

    .line 58
    .line 59
    move p1, v3

    .line 60
    goto :goto_2

    .line 61
    :cond_2
    move p1, v2

    .line 62
    :goto_2
    if-eqz v0, :cond_3

    .line 63
    .line 64
    iget v0, p3, Lm31;->W:F

    .line 65
    .line 66
    cmpl-float v0, v0, v4

    .line 67
    .line 68
    if-lez v0, :cond_3

    .line 69
    .line 70
    move v0, v3

    .line 71
    goto :goto_3

    .line 72
    :cond_3
    move v0, v2

    .line 73
    :goto_3
    const/4 v4, 0x4

    .line 74
    if-eqz p1, :cond_4

    .line 75
    .line 76
    aget p1, v1, v2

    .line 77
    .line 78
    if-ne p1, v4, :cond_4

    .line 79
    .line 80
    iput v3, p0, Ld30;->a:I

    .line 81
    .line 82
    :cond_4
    if-eqz v0, :cond_5

    .line 83
    .line 84
    aget p1, v1, v3

    .line 85
    .line 86
    if-ne p1, v4, :cond_5

    .line 87
    .line 88
    iput v3, p0, Ld30;->b:I

    .line 89
    .line 90
    :cond_5
    check-cast p2, Landroidx/constraintlayout/widget/b;

    .line 91
    .line 92
    invoke-virtual {p2, p3, p0}, Landroidx/constraintlayout/widget/b;->b(Lm31;Ld30;)V

    .line 93
    .line 94
    .line 95
    iget p1, p0, Ld30;->e:I

    .line 96
    .line 97
    invoke-virtual {p3, p1}, Lm31;->O(I)V

    .line 98
    .line 99
    .line 100
    iget p1, p0, Ld30;->f:I

    .line 101
    .line 102
    invoke-virtual {p3, p1}, Lm31;->L(I)V

    .line 103
    .line 104
    .line 105
    iget-boolean p1, p0, Ld30;->h:Z

    .line 106
    .line 107
    iput-boolean p1, p3, Lm31;->E:Z

    .line 108
    .line 109
    iget p1, p0, Ld30;->g:I

    .line 110
    .line 111
    invoke-virtual {p3, p1}, Lm31;->I(I)V

    .line 112
    .line 113
    .line 114
    iput v2, p0, Ld30;->j:I

    .line 115
    .line 116
    iget-boolean p0, p0, Ld30;->i:Z

    .line 117
    .line 118
    return p0
.end method

.method public y(Ljava/lang/CharSequence;IIIZLkz1;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    move/from16 v3, p4

    .line 8
    .line 9
    move-object/from16 v4, p6

    .line 10
    .line 11
    new-instance v5, Lmz1;

    .line 12
    .line 13
    iget-object v6, v0, Llr;->Z:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v6, Lz47;

    .line 16
    .line 17
    iget-object v6, v6, Lz47;->f0:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v6, Lfv4;

    .line 20
    .line 21
    invoke-direct {v5, v6}, Lmz1;-><init>(Lfv4;)V

    .line 22
    .line 23
    .line 24
    invoke-static/range {p1 .. p2}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    const/4 v7, 0x0

    .line 29
    const/4 v8, 0x1

    .line 30
    move v9, v6

    .line 31
    move v10, v7

    .line 32
    move v11, v8

    .line 33
    move/from16 v6, p2

    .line 34
    .line 35
    :cond_0
    :goto_0
    move v7, v6

    .line 36
    :goto_1
    const/4 v12, 0x2

    .line 37
    if-ge v6, v2, :cond_e

    .line 38
    .line 39
    if-ge v10, v3, :cond_e

    .line 40
    .line 41
    if-eqz v11, :cond_e

    .line 42
    .line 43
    iget-object v13, v5, Lmz1;->c:Lfv4;

    .line 44
    .line 45
    iget-object v13, v13, Lfv4;->a:Landroid/util/SparseArray;

    .line 46
    .line 47
    invoke-virtual {v13, v9}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v13

    .line 51
    check-cast v13, Lfv4;

    .line 52
    .line 53
    iget-byte v14, v5, Lmz1;->a:B

    .line 54
    .line 55
    const/4 v15, 0x3

    .line 56
    if-eq v14, v12, :cond_2

    .line 57
    .line 58
    if-nez v13, :cond_1

    .line 59
    .line 60
    invoke-virtual {v5}, Lmz1;->a()V

    .line 61
    .line 62
    .line 63
    :goto_2
    move v13, v8

    .line 64
    goto :goto_5

    .line 65
    :cond_1
    iput-byte v12, v5, Lmz1;->a:B

    .line 66
    .line 67
    iput-object v13, v5, Lmz1;->c:Lfv4;

    .line 68
    .line 69
    iput v8, v5, Lmz1;->f:I

    .line 70
    .line 71
    :goto_3
    move v13, v12

    .line 72
    goto :goto_5

    .line 73
    :cond_2
    if-eqz v13, :cond_3

    .line 74
    .line 75
    iput-object v13, v5, Lmz1;->c:Lfv4;

    .line 76
    .line 77
    iget v13, v5, Lmz1;->f:I

    .line 78
    .line 79
    add-int/2addr v13, v8

    .line 80
    iput v13, v5, Lmz1;->f:I

    .line 81
    .line 82
    goto :goto_3

    .line 83
    :cond_3
    const v13, 0xfe0e

    .line 84
    .line 85
    .line 86
    if-ne v9, v13, :cond_4

    .line 87
    .line 88
    invoke-virtual {v5}, Lmz1;->a()V

    .line 89
    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_4
    const v13, 0xfe0f

    .line 93
    .line 94
    .line 95
    if-ne v9, v13, :cond_5

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_5
    iget-object v13, v5, Lmz1;->c:Lfv4;

    .line 99
    .line 100
    iget-object v14, v13, Lfv4;->b:Loj8;

    .line 101
    .line 102
    if-eqz v14, :cond_8

    .line 103
    .line 104
    iget v14, v5, Lmz1;->f:I

    .line 105
    .line 106
    if-ne v14, v8, :cond_7

    .line 107
    .line 108
    invoke-virtual {v5}, Lmz1;->b()Z

    .line 109
    .line 110
    .line 111
    move-result v13

    .line 112
    if-eqz v13, :cond_6

    .line 113
    .line 114
    iget-object v13, v5, Lmz1;->c:Lfv4;

    .line 115
    .line 116
    iput-object v13, v5, Lmz1;->d:Lfv4;

    .line 117
    .line 118
    invoke-virtual {v5}, Lmz1;->a()V

    .line 119
    .line 120
    .line 121
    :goto_4
    move v13, v15

    .line 122
    goto :goto_5

    .line 123
    :cond_6
    invoke-virtual {v5}, Lmz1;->a()V

    .line 124
    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_7
    iput-object v13, v5, Lmz1;->d:Lfv4;

    .line 128
    .line 129
    invoke-virtual {v5}, Lmz1;->a()V

    .line 130
    .line 131
    .line 132
    goto :goto_4

    .line 133
    :cond_8
    invoke-virtual {v5}, Lmz1;->a()V

    .line 134
    .line 135
    .line 136
    goto :goto_2

    .line 137
    :goto_5
    iput v9, v5, Lmz1;->e:I

    .line 138
    .line 139
    if-eq v13, v8, :cond_d

    .line 140
    .line 141
    if-eq v13, v12, :cond_b

    .line 142
    .line 143
    if-eq v13, v15, :cond_9

    .line 144
    .line 145
    goto :goto_1

    .line 146
    :cond_9
    if-nez p5, :cond_a

    .line 147
    .line 148
    iget-object v12, v5, Lmz1;->d:Lfv4;

    .line 149
    .line 150
    iget-object v12, v12, Lfv4;->b:Loj8;

    .line 151
    .line 152
    invoke-virtual {v0, v1, v7, v6, v12}, Llr;->v(Ljava/lang/CharSequence;IILoj8;)Z

    .line 153
    .line 154
    .line 155
    move-result v12

    .line 156
    if-nez v12, :cond_0

    .line 157
    .line 158
    :cond_a
    iget-object v11, v5, Lmz1;->d:Lfv4;

    .line 159
    .line 160
    iget-object v11, v11, Lfv4;->b:Loj8;

    .line 161
    .line 162
    invoke-interface {v4, v1, v7, v6, v11}, Lkz1;->r(Ljava/lang/CharSequence;IILoj8;)Z

    .line 163
    .line 164
    .line 165
    move-result v11

    .line 166
    add-int/lit8 v10, v10, 0x1

    .line 167
    .line 168
    goto/16 :goto_0

    .line 169
    .line 170
    :cond_b
    invoke-static {v9}, Ljava/lang/Character;->charCount(I)I

    .line 171
    .line 172
    .line 173
    move-result v12

    .line 174
    add-int/2addr v12, v6

    .line 175
    if-ge v12, v2, :cond_c

    .line 176
    .line 177
    invoke-static {v1, v12}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    .line 178
    .line 179
    .line 180
    move-result v6

    .line 181
    move v9, v6

    .line 182
    :cond_c
    move v6, v12

    .line 183
    goto/16 :goto_1

    .line 184
    .line 185
    :cond_d
    invoke-static {v1, v7}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    .line 186
    .line 187
    .line 188
    move-result v6

    .line 189
    invoke-static {v6}, Ljava/lang/Character;->charCount(I)I

    .line 190
    .line 191
    .line 192
    move-result v6

    .line 193
    add-int/2addr v6, v7

    .line 194
    if-ge v6, v2, :cond_0

    .line 195
    .line 196
    invoke-static {v1, v6}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    .line 197
    .line 198
    .line 199
    move-result v7

    .line 200
    move v9, v7

    .line 201
    goto/16 :goto_0

    .line 202
    .line 203
    :cond_e
    iget-byte v2, v5, Lmz1;->a:B

    .line 204
    .line 205
    if-ne v2, v12, :cond_11

    .line 206
    .line 207
    iget-object v2, v5, Lmz1;->c:Lfv4;

    .line 208
    .line 209
    iget-object v2, v2, Lfv4;->b:Loj8;

    .line 210
    .line 211
    if-eqz v2, :cond_11

    .line 212
    .line 213
    iget v2, v5, Lmz1;->f:I

    .line 214
    .line 215
    if-gt v2, v8, :cond_f

    .line 216
    .line 217
    invoke-virtual {v5}, Lmz1;->b()Z

    .line 218
    .line 219
    .line 220
    move-result v2

    .line 221
    if-eqz v2, :cond_11

    .line 222
    .line 223
    :cond_f
    if-ge v10, v3, :cond_11

    .line 224
    .line 225
    if-eqz v11, :cond_11

    .line 226
    .line 227
    if-nez p5, :cond_10

    .line 228
    .line 229
    iget-object v2, v5, Lmz1;->c:Lfv4;

    .line 230
    .line 231
    iget-object v2, v2, Lfv4;->b:Loj8;

    .line 232
    .line 233
    invoke-virtual {v0, v1, v7, v6, v2}, Llr;->v(Ljava/lang/CharSequence;IILoj8;)Z

    .line 234
    .line 235
    .line 236
    move-result v0

    .line 237
    if-nez v0, :cond_11

    .line 238
    .line 239
    :cond_10
    iget-object v0, v5, Lmz1;->c:Lfv4;

    .line 240
    .line 241
    iget-object v0, v0, Lfv4;->b:Loj8;

    .line 242
    .line 243
    invoke-interface {v4, v1, v7, v6, v0}, Lkz1;->r(Ljava/lang/CharSequence;IILoj8;)Z

    .line 244
    .line 245
    .line 246
    :cond_11
    invoke-interface {v4}, Lkz1;->i()Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    return-object v0
.end method

.method public z(Ljava/lang/String;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iput-object p1, p0, Llr;->Y:Ljava/lang/Object;

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const-string p0, "Null backendName"

    .line 7
    .line 8
    invoke-static {p0}, Lb61;->i(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
