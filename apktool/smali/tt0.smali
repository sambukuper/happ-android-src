.class public final synthetic Ltt0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lh12;


# direct methods
.method public synthetic constructor <init>(Lh12;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Ltt0;->a:B

    .line 2
    .line 3
    iput-object p1, p0, Ltt0;->b:Lh12;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onFocusChange(Landroid/view/View;Z)V
    .locals 0

    .line 1
    iget-byte p1, p0, Ltt0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, Ltt0;->b:Lh12;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lyw1;

    .line 9
    .line 10
    iput-boolean p2, p0, Lyw1;->l:Z

    .line 11
    .line 12
    invoke-virtual {p0}, Lh12;->p()V

    .line 13
    .line 14
    .line 15
    if-nez p2, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    invoke-virtual {p0, p1}, Lyw1;->s(Z)V

    .line 19
    .line 20
    .line 21
    iput-boolean p1, p0, Lyw1;->m:Z

    .line 22
    .line 23
    :cond_0
    return-void

    .line 24
    :pswitch_0
    check-cast p0, Lwt0;

    .line 25
    .line 26
    invoke-virtual {p0}, Lwt0;->t()Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    invoke-virtual {p0, p1}, Lwt0;->s(Z)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
