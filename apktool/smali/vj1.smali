.class public final Lvj1;
.super Ljava/lang/Object;

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:B

.field public final Y:Lwj1;


# direct methods
.method public synthetic constructor <init>(Lwj1;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lvj1;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lvj1;->Y:Lwj1;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, Lvj1;->X:B

    .line 2
    .line 3
    iget-object p0, p0, Lvj1;->Y:Lwj1;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-static {p0, v0}, Lg33;->l(Lsj1;Z)Lwd0;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :pswitch_0
    invoke-virtual {p0}, Lsj1;->X()Lgk1;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Lgk1;->X()Lfx5;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-interface {v0}, Lfx5;->d()Ltx5;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    invoke-virtual {p0}, Lsj1;->X()Lgk1;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {p0}, Lgk1;->X()Lfx5;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    sget-object v0, Loy1;->f0:Lrm;

    .line 37
    .line 38
    invoke-static {p0, v0}, Lz91;->t(Lfx5;Lsm;)Ltx5;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    :cond_0
    return-object v0

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
