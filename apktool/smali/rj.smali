.class public final Lrj;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic g0:Landroid/graphics/drawable/Drawable;

.field public final synthetic h0:Ldn2;

.field public final synthetic i0:Ldn2;


# direct methods
.method public constructor <init>(Landroid/graphics/drawable/Drawable;Ldn2;Ldn2;Lq51;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lrj;->g0:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    iput-object p2, p0, Lrj;->h0:Ldn2;

    .line 4
    .line 5
    iput-object p3, p0, Lrj;->i0:Ldn2;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Luy7;-><init>(ILq51;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lb71;

    .line 2
    .line 3
    check-cast p2, Lq51;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, Lrj;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lrj;

    .line 10
    .line 11
    sget-object p1, Ldn8;->a:Ldn8;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lrj;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-object p1
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 2

    .line 1
    new-instance p2, Lrj;

    .line 2
    .line 3
    iget-object v0, p0, Lrj;->h0:Ldn2;

    .line 4
    .line 5
    iget-object v1, p0, Lrj;->i0:Ldn2;

    .line 6
    .line 7
    iget-object p0, p0, Lrj;->g0:Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    invoke-direct {p2, p0, v0, v1, p1}, Lrj;-><init>(Landroid/graphics/drawable/Drawable;Ldn2;Ldn2;Lq51;)V

    .line 10
    .line 11
    .line 12
    return-object p2
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lrj;->g0:Landroid/graphics/drawable/Drawable;

    .line 5
    .line 6
    check-cast p1, Landroid/graphics/drawable/AnimatedImageDrawable;

    .line 7
    .line 8
    new-instance v0, Lus8;

    .line 9
    .line 10
    iget-object v1, p0, Lrj;->h0:Ldn2;

    .line 11
    .line 12
    iget-object p0, p0, Lrj;->i0:Ldn2;

    .line 13
    .line 14
    invoke-direct {v0, v1, p0}, Lus8;-><init>(Ldn2;Ldn2;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v0}, Landroid/graphics/drawable/AnimatedImageDrawable;->registerAnimationCallback(Landroid/graphics/drawable/Animatable2$AnimationCallback;)V

    .line 18
    .line 19
    .line 20
    sget-object p0, Ldn8;->a:Ldn8;

    .line 21
    .line 22
    return-object p0
.end method
