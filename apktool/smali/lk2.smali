.class public final Llk2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lqk2;


# direct methods
.method public synthetic constructor <init>(Lqk2;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Llk2;->a:B

    .line 2
    .line 3
    iput-object p1, p0, Llk2;->b:Lqk2;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-byte v0, p0, Llk2;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Llk2;->b:Lqk2;

    .line 7
    .line 8
    iget-object v0, p0, Lqk2;->T0:Lf51;

    .line 9
    .line 10
    iget-object p0, p0, Lqk2;->w0:Ltk2;

    .line 11
    .line 12
    iget-object p0, p0, Ltk2;->C0:Landroidx/appcompat/app/AppCompatActivity;

    .line 13
    .line 14
    iput-object p0, v0, Lf51;->a:Ljava/lang/Object;

    .line 15
    .line 16
    iget-object v0, v0, Lf51;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Lia5;

    .line 35
    .line 36
    invoke-interface {v1, p0}, Lia5;->a(Landroidx/activity/ComponentActivity;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    return-void

    .line 41
    :pswitch_0
    iget-object p0, p0, Llk2;->b:Lqk2;

    .line 42
    .line 43
    iget-object v0, p0, Lqk2;->X0:Lxd6;

    .line 44
    .line 45
    invoke-virtual {v0}, Lxd6;->w()V

    .line 46
    .line 47
    .line 48
    invoke-static {p0}, Lsv6;->b(Lyv6;)V

    .line 49
    .line 50
    .line 51
    iget-object v0, p0, Lqk2;->Y:Landroid/os/Bundle;

    .line 52
    .line 53
    if-eqz v0, :cond_1

    .line 54
    .line 55
    const-string v1, "registryState"

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    goto :goto_1

    .line 62
    :cond_1
    const/4 v0, 0x0

    .line 63
    :goto_1
    iget-object p0, p0, Lqk2;->X0:Lxd6;

    .line 64
    .line 65
    invoke-virtual {p0, v0}, Lxd6;->x(Landroid/os/Bundle;)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
