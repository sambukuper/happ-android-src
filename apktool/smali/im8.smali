.class public final Lim8;
.super Lqm8;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final synthetic a:B

.field public final b:I


# direct methods
.method public synthetic constructor <init>(BI)V
    .locals 0

    .line 1
    iput-byte p1, p0, Lim8;->a:B

    .line 2
    .line 3
    iput p2, p0, Lim8;->b:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget-byte v0, p0, Lim8;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget p0, p0, Lim8;->b:I

    .line 7
    .line 8
    return p0

    .line 9
    :pswitch_0
    iget p0, p0, Lim8;->b:I

    .line 10
    .line 11
    return p0

    .line 12
    :pswitch_1
    iget p0, p0, Lim8;->b:I

    .line 13
    .line 14
    return p0

    .line 15
    :pswitch_2
    iget p0, p0, Lim8;->b:I

    .line 16
    .line 17
    return p0

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b()C
    .locals 0

    .line 1
    iget-byte p0, p0, Lim8;->a:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/16 p0, 0x5a

    .line 7
    .line 8
    return p0

    .line 9
    :pswitch_0
    const/16 p0, 0x78

    .line 10
    .line 11
    return p0

    .line 12
    :pswitch_1
    const/16 p0, 0x58

    .line 13
    .line 14
    return p0

    .line 15
    :pswitch_2
    const/16 p0, 0x4f

    .line 16
    .line 17
    return p0

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final c(Lwr8;ZZ)V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    sget-object v2, Lg09;->Z:Lg09;

    .line 4
    .line 5
    sget-object v3, Lg09;->Y:Lg09;

    .line 6
    .line 7
    iget v4, p0, Lim8;->b:I

    .line 8
    .line 9
    iget-byte v5, p0, Lim8;->a:B

    .line 10
    .line 11
    packed-switch v5, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    goto :goto_1

    .line 15
    :pswitch_0
    if-ne v4, v1, :cond_0

    .line 16
    .line 17
    :goto_0
    move-object v2, v3

    .line 18
    goto :goto_1

    .line 19
    :pswitch_1
    if-ne v4, v1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    :goto_1
    sget-object v6, Lg09;->X:Lg09;

    .line 23
    .line 24
    const/4 v7, 0x3

    .line 25
    packed-switch v5, :pswitch_data_1

    .line 26
    .line 27
    .line 28
    if-gt v4, v7, :cond_1

    .line 29
    .line 30
    :goto_2
    move-object v3, v6

    .line 31
    goto :goto_3

    .line 32
    :pswitch_2
    if-gt v4, v7, :cond_1

    .line 33
    .line 34
    goto :goto_2

    .line 35
    :pswitch_3
    if-gt v4, v7, :cond_1

    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_1
    :goto_3
    sget-object p0, Lzr8;->a:Lvz7;

    .line 39
    .line 40
    invoke-virtual {v2, v3}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    if-ltz p0, :cond_3

    .line 45
    .line 46
    if-eqz p2, :cond_2

    .line 47
    .line 48
    new-instance p0, Lyr8;

    .line 49
    .line 50
    invoke-direct {p0, v2, p3, v3, v1}, Lyr8;-><init>(Lg09;ZLg09;B)V

    .line 51
    .line 52
    .line 53
    const-string p2, "Z"

    .line 54
    .line 55
    invoke-static {p1, p2, p0}, Lz68;->v0(Lcc1;Ljava/lang/String;Lgn2;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_2
    invoke-static {p1}, Lwr8;->p(Lwr8;)V

    .line 60
    .line 61
    .line 62
    new-instance p0, Lzs1;

    .line 63
    .line 64
    const/4 p2, 0x6

    .line 65
    invoke-direct {p0, p3, v3, p2}, Lzs1;-><init>(ZLjava/lang/Object;B)V

    .line 66
    .line 67
    .line 68
    invoke-static {p1, v2, p0}, Lzr8;->a(Lwr8;Lg09;Lgn2;)V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :cond_3
    const-string p0, "Seconds cannot be included without minutes"

    .line 73
    .line 74
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :pswitch_4
    invoke-static {p0}, Lvm8;->c(Lqm8;)V

    .line 79
    .line 80
    .line 81
    throw v0

    .line 82
    :pswitch_5
    invoke-static {p0}, Lvm8;->c(Lqm8;)V

    .line 83
    .line 84
    .line 85
    throw v0

    .line 86
    nop

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method
