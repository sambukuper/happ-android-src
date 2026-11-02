.class public final Lg5;
.super Ldu4;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final synthetic m:B

.field public final synthetic n:Landroidx/appcompat/widget/a;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/a;Landroid/content/Context;Lgn7;Landroid/view/View;)V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, Lg5;->m:B

    .line 3
    .line 4
    iput-object p1, p0, Lg5;->n:Landroidx/appcompat/widget/a;

    .line 5
    .line 6
    sget v2, Lw26;->actionOverflowMenuStyle:I

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v7, 0x0

    .line 10
    move-object v1, p0

    .line 11
    move-object v5, p2

    .line 12
    move-object v4, p3

    .line 13
    move-object v6, p4

    .line 14
    invoke-direct/range {v1 .. v7}, Ldu4;-><init>(IILnt4;Landroid/content/Context;Landroid/view/View;Z)V

    .line 15
    .line 16
    .line 17
    iget-object p0, v4, Lgn7;->A:Lst4;

    .line 18
    .line 19
    iget p0, p0, Lst4;->x:I

    .line 20
    .line 21
    const/16 p2, 0x20

    .line 22
    .line 23
    and-int/2addr p0, p2

    .line 24
    if-ne p0, p2, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    iget-object p0, p1, Landroidx/appcompat/widget/a;->k0:Li5;

    .line 28
    .line 29
    if-nez p0, :cond_1

    .line 30
    .line 31
    iget-object p0, p1, Lf20;->j0:Lku4;

    .line 32
    .line 33
    check-cast p0, Landroid/view/View;

    .line 34
    .line 35
    :cond_1
    iput-object p0, v1, Ldu4;->f:Landroid/view/View;

    .line 36
    .line 37
    :goto_0
    iget-object p0, p1, Landroidx/appcompat/widget/a;->y0:Lyr2;

    .line 38
    .line 39
    iput-object p0, v1, Ldu4;->i:Lhu4;

    .line 40
    .line 41
    iget-object p1, v1, Ldu4;->j:Lbu4;

    .line 42
    .line 43
    if-eqz p1, :cond_2

    .line 44
    .line 45
    invoke-interface {p1, p0}, Liu4;->g(Lhu4;)V

    .line 46
    .line 47
    .line 48
    :cond_2
    return-void
.end method

.method public constructor <init>(Landroidx/appcompat/widget/a;Landroid/content/Context;Lnt4;Landroid/view/View;)V
    .locals 8

    const/4 v0, 0x1

    iput-byte v0, p0, Lg5;->m:B

    .line 49
    iput-object p1, p0, Lg5;->n:Landroidx/appcompat/widget/a;

    .line 50
    sget v2, Lw26;->actionOverflowMenuStyle:I

    const/4 v3, 0x0

    const/4 v7, 0x1

    move-object v1, p0

    move-object v5, p2

    move-object v4, p3

    move-object v6, p4

    .line 51
    invoke-direct/range {v1 .. v7}, Ldu4;-><init>(IILnt4;Landroid/content/Context;Landroid/view/View;Z)V

    const p0, 0x800005

    .line 52
    iput p0, v1, Ldu4;->g:I

    .line 53
    iget-object p0, p1, Landroidx/appcompat/widget/a;->y0:Lyr2;

    .line 54
    iput-object p0, v1, Ldu4;->i:Lhu4;

    .line 55
    iget-object p1, v1, Ldu4;->j:Lbu4;

    if-eqz p1, :cond_0

    .line 56
    invoke-interface {p1, p0}, Liu4;->g(Lhu4;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final c()V
    .locals 4

    .line 1
    iget-byte v0, p0, Lg5;->m:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Lg5;->n:Landroidx/appcompat/widget/a;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object v0, v2, Lf20;->Z:Lnt4;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    invoke-virtual {v0, v3}, Lnt4;->c(Z)V

    .line 15
    .line 16
    .line 17
    :cond_0
    iput-object v1, v2, Landroidx/appcompat/widget/a;->u0:Lg5;

    .line 18
    .line 19
    invoke-super {p0}, Ldu4;->c()V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_0
    iput-object v1, v2, Landroidx/appcompat/widget/a;->v0:Lg5;

    .line 24
    .line 25
    invoke-super {p0}, Ldu4;->c()V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
