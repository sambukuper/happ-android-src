.class public final synthetic Lyf1;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lfg1;

.field public final synthetic Z:Lxe7;


# direct methods
.method public synthetic constructor <init>(Lfg1;Lxe7;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Lyf1;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lyf1;->Y:Lfg1;

    .line 4
    .line 5
    iput-object p2, p0, Lyf1;->Z:Lxe7;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-byte v0, p0, Lyf1;->X:B

    .line 2
    .line 3
    iget-object v1, p0, Lyf1;->Z:Lxe7;

    .line 4
    .line 5
    iget-object p0, p0, Lyf1;->Y:Lfg1;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lfg1;->b:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    iget-object p0, p0, Lfg1;->c:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_0
    iget-object v0, p0, Lfg1;->b:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    iget-object v0, v1, Lxe7;->a:Lze7;

    .line 30
    .line 31
    iget-object v1, v1, Lxe7;->c:Lqk2;

    .line 32
    .line 33
    iget-object v1, v1, Lqk2;->J0:Landroid/view/View;

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    iget-object p0, p0, Lfg1;->a:Landroid/view/ViewGroup;

    .line 39
    .line 40
    invoke-virtual {v0, v1, p0}, Lze7;->a(Landroid/view/View;Landroid/view/ViewGroup;)V

    .line 41
    .line 42
    .line 43
    :cond_0
    return-void

    .line 44
    :pswitch_1
    invoke-virtual {p0, v1}, Lfg1;->a(Lxe7;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    nop

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
