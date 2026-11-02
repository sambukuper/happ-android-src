.class public final synthetic Lpv2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lzy0;

.field public final synthetic Z:Landroid/content/Context;

.field public final synthetic f0:Landroid/app/Activity;

.field public final synthetic g0:Landroid/content/res/Configuration;


# direct methods
.method public synthetic constructor <init>(Lzy0;Landroid/content/Context;Landroid/app/Activity;Landroid/content/res/Configuration;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, Lpv2;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lpv2;->Y:Lzy0;

    .line 4
    .line 5
    iput-object p2, p0, Lpv2;->Z:Landroid/content/Context;

    .line 6
    .line 7
    iput-object p3, p0, Lpv2;->f0:Landroid/app/Activity;

    .line 8
    .line 9
    iput-object p4, p0, Lpv2;->g0:Landroid/content/res/Configuration;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, Lpv2;->X:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x1

    .line 8
    iget-object v5, p0, Lpv2;->g0:Landroid/content/res/Configuration;

    .line 9
    .line 10
    iget-object v6, p0, Lpv2;->f0:Landroid/app/Activity;

    .line 11
    .line 12
    iget-object v7, p0, Lpv2;->Z:Landroid/content/Context;

    .line 13
    .line 14
    iget-object p0, p0, Lpv2;->Y:Lzy0;

    .line 15
    .line 16
    check-cast p1, Llp2;

    .line 17
    .line 18
    check-cast p2, Ljava/lang/Integer;

    .line 19
    .line 20
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    packed-switch v0, :pswitch_data_0

    .line 25
    .line 26
    .line 27
    and-int/lit8 v0, p2, 0x3

    .line 28
    .line 29
    if-eq v0, v3, :cond_0

    .line 30
    .line 31
    move v2, v4

    .line 32
    :cond_0
    and-int/2addr p2, v4

    .line 33
    invoke-virtual {p1, p2, v2}, Llp2;->N(IZ)Z

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    if-eqz p2, :cond_1

    .line 38
    .line 39
    new-instance p2, Lh8;

    .line 40
    .line 41
    const/4 v0, 0x4

    .line 42
    invoke-direct {p2, p0, v0}, Lh8;-><init>(Lzy0;B)V

    .line 43
    .line 44
    .line 45
    const p0, 0x5fac13c9

    .line 46
    .line 47
    .line 48
    invoke-static {p0, p2, p1}, Ljm4;->U(ILon2;Llp2;)Lzy0;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-static {v7, v6, v5, p0, p1}, Lch3;->d(Landroid/content/Context;Landroid/app/Activity;Landroid/content/res/Configuration;Lzy0;Llp2;)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    invoke-virtual {p1}, Llp2;->Q()V

    .line 57
    .line 58
    .line 59
    :goto_0
    return-object v1

    .line 60
    :pswitch_0
    and-int/lit8 v0, p2, 0x3

    .line 61
    .line 62
    if-eq v0, v3, :cond_2

    .line 63
    .line 64
    move v2, v4

    .line 65
    :cond_2
    and-int/2addr p2, v4

    .line 66
    invoke-virtual {p1, p2, v2}, Llp2;->N(IZ)Z

    .line 67
    .line 68
    .line 69
    move-result p2

    .line 70
    if-eqz p2, :cond_3

    .line 71
    .line 72
    new-instance p2, Lh8;

    .line 73
    .line 74
    const/4 v0, 0x3

    .line 75
    invoke-direct {p2, p0, v0}, Lh8;-><init>(Lzy0;B)V

    .line 76
    .line 77
    .line 78
    const p0, -0xa91f52

    .line 79
    .line 80
    .line 81
    invoke-static {p0, p2, p1}, Ljm4;->U(ILon2;Llp2;)Lzy0;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-static {v7, v6, v5, p0, p1}, Lch3;->d(Landroid/content/Context;Landroid/app/Activity;Landroid/content/res/Configuration;Lzy0;Llp2;)V

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_3
    invoke-virtual {p1}, Llp2;->Q()V

    .line 90
    .line 91
    .line 92
    :goto_1
    return-object v1

    .line 93
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
