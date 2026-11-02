.class public final synthetic Lsf1;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Llh7;


# direct methods
.method public synthetic constructor <init>(Llh7;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lsf1;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lsf1;->Y:Llh7;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, Lsf1;->X:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    iget-object p0, p0, Lsf1;->Y:Llh7;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Lpk6;

    .line 11
    .line 12
    invoke-interface {p0}, Llh7;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Ljava/lang/Number;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    invoke-virtual {p1, p0}, Lpk6;->b(F)V

    .line 23
    .line 24
    .line 25
    return-object v1

    .line 26
    :pswitch_0
    check-cast p1, Lpk6;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-interface {p0}, Llh7;->getValue()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Ljava/lang/Number;

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    invoke-virtual {p1, v0}, Lpk6;->g(F)V

    .line 42
    .line 43
    .line 44
    invoke-interface {p0}, Llh7;->getValue()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, Ljava/lang/Number;

    .line 49
    .line 50
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    invoke-virtual {p1, p0}, Lpk6;->h(F)V

    .line 55
    .line 56
    .line 57
    return-object v1

    .line 58
    :pswitch_1
    move-object v2, p1

    .line 59
    check-cast v2, Lsv1;

    .line 60
    .line 61
    invoke-interface {p0}, Llh7;->getValue()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, Ldw0;

    .line 66
    .line 67
    iget-wide v3, p0, Ldw0;->a:J

    .line 68
    .line 69
    sget-wide p0, Ldw0;->g:J

    .line 70
    .line 71
    invoke-static {v3, v4, p0, p1}, Ltk8;->a(JJ)Z

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    if-nez p0, :cond_0

    .line 76
    .line 77
    const/4 v9, 0x0

    .line 78
    const/16 v10, 0x7e

    .line 79
    .line 80
    const-wide/16 v5, 0x0

    .line 81
    .line 82
    const-wide/16 v7, 0x0

    .line 83
    .line 84
    invoke-static/range {v2 .. v10}, Lsv1;->k0(Lsv1;JJJFI)V

    .line 85
    .line 86
    .line 87
    :cond_0
    return-object v1

    .line 88
    nop

    .line 89
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
