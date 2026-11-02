.class public final synthetic Loh4;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Loh2;


# direct methods
.method public synthetic constructor <init>(Loh2;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Loh4;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Loh4;->Y:Loh2;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, Loh4;->X:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    sget-object v2, Lzz0;->a:Lbe;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    iget-object p0, p0, Loh4;->Y:Loh2;

    .line 10
    .line 11
    const/4 v5, 0x2

    .line 12
    check-cast p1, Llp2;

    .line 13
    .line 14
    check-cast p2, Ljava/lang/Integer;

    .line 15
    .line 16
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    packed-switch v0, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    and-int/lit8 v0, p2, 0x3

    .line 24
    .line 25
    if-eq v0, v5, :cond_0

    .line 26
    .line 27
    move v0, v3

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move v0, v4

    .line 30
    :goto_0
    and-int/2addr p2, v3

    .line 31
    invoke-virtual {p1, p2, v0}, Llp2;->N(IZ)Z

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    if-eqz p2, :cond_2

    .line 36
    .line 37
    sget-object p2, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/FillElement;

    .line 38
    .line 39
    invoke-static {p2}, Lch3;->u(Lkx4;)Lkx4;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-virtual {p1}, Llp2;->K()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    if-ne v0, v2, :cond_1

    .line 48
    .line 49
    new-instance v0, Lbz2;

    .line 50
    .line 51
    const/4 v2, 0x6

    .line 52
    invoke-direct {v0, p0, v2}, Lbz2;-><init>(Loh2;B)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, v0}, Llp2;->g0(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    :cond_1
    check-cast v0, Lgn2;

    .line 59
    .line 60
    invoke-static {p2, v0}, Lz91;->C(Lkx4;Lgn2;)Lkx4;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-static {p0, p1, v4}, Ldu7;->a(Lkx4;Llp2;I)V

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_2
    invoke-virtual {p1}, Llp2;->Q()V

    .line 69
    .line 70
    .line 71
    :goto_1
    return-object v1

    .line 72
    :pswitch_0
    and-int/lit8 v0, p2, 0x3

    .line 73
    .line 74
    if-eq v0, v5, :cond_3

    .line 75
    .line 76
    move v0, v3

    .line 77
    goto :goto_2

    .line 78
    :cond_3
    move v0, v4

    .line 79
    :goto_2
    and-int/2addr p2, v3

    .line 80
    invoke-virtual {p1, p2, v0}, Llp2;->N(IZ)Z

    .line 81
    .line 82
    .line 83
    move-result p2

    .line 84
    if-eqz p2, :cond_5

    .line 85
    .line 86
    sget-object p2, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/FillElement;

    .line 87
    .line 88
    invoke-static {p2}, Lch3;->u(Lkx4;)Lkx4;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    invoke-virtual {p1}, Llp2;->K()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    if-ne v0, v2, :cond_4

    .line 97
    .line 98
    new-instance v0, Lbz2;

    .line 99
    .line 100
    invoke-direct {v0, p0, v5}, Lbz2;-><init>(Loh2;B)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1, v0}, Llp2;->g0(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    :cond_4
    check-cast v0, Lgn2;

    .line 107
    .line 108
    invoke-static {p2, v0}, Lz91;->C(Lkx4;Lgn2;)Lkx4;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    invoke-static {p0, p1, v4}, Lnr4;->b(Lkx4;Llp2;I)V

    .line 113
    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_5
    invoke-virtual {p1}, Llp2;->Q()V

    .line 117
    .line 118
    .line 119
    :goto_3
    return-object v1

    .line 120
    nop

    .line 121
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
