.class public final synthetic Lln5;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lb71;

.field public final synthetic Z:Lux0;


# direct methods
.method public synthetic constructor <init>(Lb71;Lux0;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Lln5;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lln5;->Y:Lb71;

    .line 4
    .line 5
    iput-object p2, p0, Lln5;->Z:Lux0;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, Lln5;->X:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    iget-object v3, p0, Lln5;->Y:Lb71;

    .line 7
    .line 8
    check-cast p1, Ljava/lang/Long;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 11
    .line 12
    .line 13
    move-result-wide v6

    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    sget-object p1, Ltp1;->a:Lnf1;

    .line 18
    .line 19
    sget-object p1, Ldm4;->a:Lhv2;

    .line 20
    .line 21
    new-instance v4, Lmn5;

    .line 22
    .line 23
    const/4 v8, 0x0

    .line 24
    const/4 v9, 0x1

    .line 25
    iget-object v5, p0, Lln5;->Z:Lux0;

    .line 26
    .line 27
    invoke-direct/range {v4 .. v9}, Lmn5;-><init>(Lux0;JLq51;B)V

    .line 28
    .line 29
    .line 30
    invoke-static {v3, p1, v4, v2}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 31
    .line 32
    .line 33
    return-object v1

    .line 34
    :pswitch_0
    sget-object p1, Ltp1;->a:Lnf1;

    .line 35
    .line 36
    sget-object p1, Ldm4;->a:Lhv2;

    .line 37
    .line 38
    new-instance v4, Lmn5;

    .line 39
    .line 40
    const/4 v8, 0x0

    .line 41
    const/4 v9, 0x0

    .line 42
    iget-object v5, p0, Lln5;->Z:Lux0;

    .line 43
    .line 44
    invoke-direct/range {v4 .. v9}, Lmn5;-><init>(Lux0;JLq51;B)V

    .line 45
    .line 46
    .line 47
    invoke-static {v3, p1, v4, v2}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 48
    .line 49
    .line 50
    return-object v1

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
