.class public final synthetic Lqz0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Landroid/os/CancellationSignal$OnCancelListener;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lqz0;->a:B

    .line 2
    .line 3
    iput-object p1, p0, Lqz0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onCancel()V
    .locals 4

    .line 1
    iget-byte v0, p0, Lqz0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, Lqz0;->b:Ljava/lang/Object;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p0, Lkd8;

    .line 10
    .line 11
    iget-object v0, p0, Lkd8;->a:Ly68;

    .line 12
    .line 13
    iget-object v2, p0, Lkd8;->b:Lde3;

    .line 14
    .line 15
    iget-object v3, v0, Ly68;->b:Lg48;

    .line 16
    .line 17
    invoke-virtual {v3}, Lg48;->a()Lmj0;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-virtual {v3}, Lmj0;->A()V

    .line 22
    .line 23
    .line 24
    iget-object v3, v0, Ly68;->b:Lg48;

    .line 25
    .line 26
    iput-object v1, v3, Lg48;->l0:Lqg5;

    .line 27
    .line 28
    invoke-virtual {p0, v3}, Lkd8;->l(Lg48;)V

    .line 29
    .line 30
    .line 31
    const/4 p0, 0x1

    .line 32
    sget-object v1, Le58;->X:Le58;

    .line 33
    .line 34
    invoke-virtual {v0, v2, p0, v1}, Ly68;->b(Lde3;ZLe58;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, p0}, Ly68;->f(Z)V

    .line 38
    .line 39
    .line 40
    iget-object p0, v0, Ly68;->b:Lg48;

    .line 41
    .line 42
    iget-boolean p0, p0, Lg48;->g0:Z

    .line 43
    .line 44
    invoke-virtual {v0, p0}, Ly68;->e(Z)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :pswitch_0
    check-cast p0, Log7;

    .line 49
    .line 50
    invoke-virtual {p0, v1}, Lrm3;->m(Ljava/util/concurrent/CancellationException;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
