.class public final Lu75;
.super Lkb8;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lp51;


# static fields
.field public static final g0:Lu75;

.field public static final h0:Lu75;

.field public static final i0:Lu75;


# instance fields
.field public final synthetic f0:B


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lu75;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lu75;-><init>(B)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lu75;->g0:Lu75;

    .line 8
    .line 9
    new-instance v0, Lu75;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, Lu75;-><init>(B)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lu75;->h0:Lu75;

    .line 16
    .line 17
    new-instance v0, Lu75;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-direct {v0, v1}, Lu75;-><init>(B)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lu75;->i0:Lu75;

    .line 24
    .line 25
    return-void
.end method

.method public constructor <init>(B)V
    .locals 1

    .line 1
    iput-byte p1, p0, Lu75;->f0:B

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-class p1, Ljava/lang/Float;

    .line 7
    .line 8
    const/4 v0, 0x2

    .line 9
    invoke-direct {p0, p1, v0}, Lkb8;-><init>(Ljava/lang/Class;B)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_0
    const-class p1, Ljava/lang/Short;

    .line 14
    .line 15
    const/4 v0, 0x2

    .line 16
    invoke-direct {p0, p1, v0}, Lkb8;-><init>(Ljava/lang/Class;B)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_1
    const-class p1, Ljava/lang/Number;

    .line 21
    .line 22
    const/4 v0, 0x2

    .line 23
    invoke-direct {p0, p1, v0}, Lkb8;-><init>(Ljava/lang/Class;B)V

    .line 24
    .line 25
    .line 26
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic constructor <init>(Ljava/lang/Class;B)V
    .locals 0

    .line 27
    iput-byte p2, p0, Lu75;->f0:B

    const/4 p2, 0x2

    invoke-direct {p0, p1, p2}, Lkb8;-><init>(Ljava/lang/Class;B)V

    return-void
.end method


# virtual methods
.method public final a(Lt37;Ld50;)Lar3;
    .locals 1

    .line 1
    iget-object v0, p0, Llj7;->X:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-static {p1, p2, v0}, Llj7;->k(Lt37;Ld50;Ljava/lang/Class;)Lno3;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_2

    .line 8
    .line 9
    iget-object p1, p1, Lno3;->Y:Lmo3;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    const/4 p2, 0x5

    .line 16
    if-eq p1, p2, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const-class p0, Ljava/math/BigDecimal;

    .line 20
    .line 21
    if-ne v0, p0, :cond_1

    .line 22
    .line 23
    sget-object p0, Ls75;->g0:Ls75;

    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_1
    sget-object p0, Ls75;->h0:Ls75;

    .line 27
    .line 28
    :cond_2
    :goto_0
    return-object p0
.end method

.method public final e(Ljava/lang/Object;Lro3;Lt37;)V
    .locals 0

    .line 1
    iget-byte p0, p0, Lu75;->f0:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Long;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 9
    .line 10
    .line 11
    move-result-wide p0

    .line 12
    invoke-virtual {p2, p0, p1}, Lro3;->u0(J)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    check-cast p1, Ljava/lang/Integer;

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    invoke-virtual {p2, p0}, Lro3;->c0(I)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_1
    check-cast p1, Ljava/lang/Double;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    .line 29
    .line 30
    .line 31
    move-result-wide p0

    .line 32
    invoke-virtual {p2, p0, p1}, Lro3;->Y(D)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :pswitch_2
    check-cast p1, Ljava/lang/Short;

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/Short;->shortValue()S

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    invoke-virtual {p2, p0}, Lro3;->B0(S)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :pswitch_3
    check-cast p1, Ljava/lang/Number;

    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    invoke-virtual {p2, p0}, Lro3;->c0(I)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :pswitch_4
    check-cast p1, Ljava/lang/Float;

    .line 57
    .line 58
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    invoke-virtual {p2, p0}, Lro3;->a0(F)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    nop

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public f(Ljava/lang/Object;Lro3;Lt37;Lri8;)V
    .locals 2

    .line 1
    iget-byte v0, p0, Lu75;->f0:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3, p4}, Lkb8;->f(Ljava/lang/Object;Lro3;Lt37;Lri8;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    invoke-virtual {p0, p1, p2, p3}, Lu75;->e(Ljava/lang/Object;Lro3;Lt37;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_1
    move-object p0, p1

    .line 15
    check-cast p0, Ljava/lang/Double;

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    sget-object p3, Lq75;->a:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {v0, v1}, Ljava/lang/Double;->isFinite(D)Z

    .line 24
    .line 25
    .line 26
    move-result p3

    .line 27
    if-nez p3, :cond_0

    .line 28
    .line 29
    sget-object p3, Lgr3;->j0:Lgr3;

    .line 30
    .line 31
    invoke-virtual {p4, p1, p3}, Lri8;->d(Ljava/lang/Object;Lgr3;)Lz76;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p4, p2, p1}, Lri8;->e(Lro3;Lz76;)Lz76;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    .line 40
    .line 41
    .line 42
    move-result-wide v0

    .line 43
    invoke-virtual {p2, v0, v1}, Lro3;->Y(D)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p4, p2, p1}, Lri8;->f(Lro3;Lz76;)Lz76;

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    .line 51
    .line 52
    .line 53
    move-result-wide p0

    .line 54
    invoke-virtual {p2, p0, p1}, Lro3;->Y(D)V

    .line 55
    .line 56
    .line 57
    :goto_0
    return-void

    .line 58
    nop

    .line 59
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
