.class public final synthetic Lcz0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ltn2;


# instance fields
.field public final synthetic X:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, Lcz0;->X:B

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte p0, p0, Lcz0;->X:B

    .line 2
    .line 3
    sget-object v0, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    const/16 v3, 0x90

    .line 8
    .line 9
    const/16 v4, 0x10

    .line 10
    .line 11
    const/16 v5, 0x20

    .line 12
    .line 13
    const/4 v6, 0x1

    .line 14
    packed-switch p0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    check-cast p1, Ls61;

    .line 18
    .line 19
    check-cast p2, Landroid/content/Context;

    .line 20
    .line 21
    check-cast p3, Lzz6;

    .line 22
    .line 23
    check-cast p4, Lge4;

    .line 24
    .line 25
    new-instance p0, Lop5;

    .line 26
    .line 27
    invoke-direct {p0, p1, p2, p3, p4}, Lop5;-><init>(Ls61;Landroid/content/Context;Lzz6;Lge4;)V

    .line 28
    .line 29
    .line 30
    return-object p0

    .line 31
    :pswitch_0
    check-cast p1, Ljava/lang/Integer;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    check-cast p2, Lmw2;

    .line 37
    .line 38
    check-cast p3, Llp2;

    .line 39
    .line 40
    check-cast p4, Ljava/lang/Integer;

    .line 41
    .line 42
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    and-int/lit8 p1, p0, 0x30

    .line 50
    .line 51
    if-nez p1, :cond_1

    .line 52
    .line 53
    invoke-virtual {p3, p2}, Llp2;->f(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    if-eqz p1, :cond_0

    .line 58
    .line 59
    move v4, v5

    .line 60
    :cond_0
    or-int/2addr p0, v4

    .line 61
    :cond_1
    and-int/lit16 p1, p0, 0x91

    .line 62
    .line 63
    if-eq p1, v3, :cond_2

    .line 64
    .line 65
    move v2, v6

    .line 66
    :cond_2
    and-int/lit8 p1, p0, 0x1

    .line 67
    .line 68
    invoke-virtual {p3, p1, v2}, Llp2;->N(IZ)Z

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    if-eqz p1, :cond_3

    .line 73
    .line 74
    shr-int/lit8 p0, p0, 0x3

    .line 75
    .line 76
    and-int/lit8 p0, p0, 0xe

    .line 77
    .line 78
    invoke-static {p2, v1, p3, p0}, Ljm4;->a(Lmw2;Lkx4;Llp2;I)V

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_3
    invoke-virtual {p3}, Llp2;->Q()V

    .line 83
    .line 84
    .line 85
    :goto_0
    return-object v0

    .line 86
    :pswitch_1
    check-cast p1, Ljava/lang/Integer;

    .line 87
    .line 88
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    check-cast p2, Lmw2;

    .line 92
    .line 93
    check-cast p3, Llp2;

    .line 94
    .line 95
    check-cast p4, Ljava/lang/Integer;

    .line 96
    .line 97
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    .line 98
    .line 99
    .line 100
    move-result p0

    .line 101
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    and-int/lit8 p1, p0, 0x30

    .line 105
    .line 106
    if-nez p1, :cond_5

    .line 107
    .line 108
    invoke-virtual {p3, p2}, Llp2;->f(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    if-eqz p1, :cond_4

    .line 113
    .line 114
    move v4, v5

    .line 115
    :cond_4
    or-int/2addr p0, v4

    .line 116
    :cond_5
    and-int/lit16 p1, p0, 0x91

    .line 117
    .line 118
    if-eq p1, v3, :cond_6

    .line 119
    .line 120
    move v2, v6

    .line 121
    :cond_6
    and-int/lit8 p1, p0, 0x1

    .line 122
    .line 123
    invoke-virtual {p3, p1, v2}, Llp2;->N(IZ)Z

    .line 124
    .line 125
    .line 126
    move-result p1

    .line 127
    if-eqz p1, :cond_7

    .line 128
    .line 129
    shr-int/lit8 p0, p0, 0x3

    .line 130
    .line 131
    and-int/lit8 p0, p0, 0xe

    .line 132
    .line 133
    invoke-static {p2, v1, p3, p0}, Ljm4;->a(Lmw2;Lkx4;Llp2;I)V

    .line 134
    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_7
    invoke-virtual {p3}, Llp2;->Q()V

    .line 138
    .line 139
    .line 140
    :goto_1
    return-object v0

    .line 141
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
