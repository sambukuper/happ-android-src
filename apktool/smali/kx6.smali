.class public final synthetic Lkx6;
.super Ly6;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic j0:B


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V
    .locals 0

    .line 1
    iput-byte p7, p0, Lkx6;->j0:B

    .line 2
    .line 3
    invoke-direct/range {p0 .. p6}, Ly6;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, Lkx6;->j0:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    iget-object p0, p0, Ly6;->X:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Lq51;

    .line 11
    .line 12
    check-cast p0, Lh69;

    .line 13
    .line 14
    invoke-interface {p0}, Lh69;->a()Lri7;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    iget-wide v2, p0, Lri7;->c:J

    .line 19
    .line 20
    iget-wide v4, p0, Lri7;->b:J

    .line 21
    .line 22
    invoke-virtual {p0, v2, v3, v4, v5}, Lri7;->a(JJ)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    return-object v1

    .line 26
    :pswitch_0
    check-cast p1, Ll73;

    .line 27
    .line 28
    iget p1, p1, Ll73;->a:I

    .line 29
    .line 30
    check-cast p0, Ly48;

    .line 31
    .line 32
    invoke-virtual {p0, p1}, Ly48;->b1(I)Z

    .line 33
    .line 34
    .line 35
    return-object v1

    .line 36
    :pswitch_1
    check-cast p1, Llx6;

    .line 37
    .line 38
    check-cast p0, Lc15;

    .line 39
    .line 40
    invoke-virtual {p0, p1}, Lc15;->b(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    return-object v1

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
