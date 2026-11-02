.class public final synthetic Lst8;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Ltt8;


# direct methods
.method public synthetic constructor <init>(Ltt8;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lst8;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lst8;->Y:Ltt8;

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
    .locals 9

    .line 1
    iget-byte v0, p0, Lst8;->X:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    iget-object p0, p0, Lst8;->Y:Ltt8;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Lsv1;

    .line 11
    .line 12
    iget-object v0, p0, Ltt8;->b:Lou2;

    .line 13
    .line 14
    iget v2, p0, Ltt8;->k:F

    .line 15
    .line 16
    iget p0, p0, Ltt8;->l:F

    .line 17
    .line 18
    invoke-interface {p1}, Lsv1;->n0()Llr;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-virtual {v3}, Llr;->p()J

    .line 23
    .line 24
    .line 25
    move-result-wide v4

    .line 26
    invoke-virtual {v3}, Llr;->k()Lsm0;

    .line 27
    .line 28
    .line 29
    move-result-object v6

    .line 30
    invoke-interface {v6}, Lsm0;->g()V

    .line 31
    .line 32
    .line 33
    :try_start_0
    iget-object v6, v3, Llr;->Y:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v6, Lwl6;

    .line 36
    .line 37
    const-wide/16 v7, 0x0

    .line 38
    .line 39
    invoke-virtual {v6, v2, p0, v7, v8}, Lwl6;->U(FFJ)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, p1}, Lou2;->a(Lsv1;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    invoke-static {v3, v4, v5}, Lp61;->w(Llr;J)V

    .line 46
    .line 47
    .line 48
    return-object v1

    .line 49
    :catchall_0
    move-exception p0

    .line 50
    invoke-static {v3, v4, v5}, Lp61;->w(Llr;J)V

    .line 51
    .line 52
    .line 53
    throw p0

    .line 54
    :pswitch_0
    check-cast p1, Ldt8;

    .line 55
    .line 56
    const/4 p1, 0x1

    .line 57
    iput-boolean p1, p0, Ltt8;->d:Z

    .line 58
    .line 59
    iget-object p0, p0, Ltt8;->f:Ldn2;

    .line 60
    .line 61
    invoke-interface {p0}, Ldn2;->invoke()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    return-object v1

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
