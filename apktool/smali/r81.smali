.class public final Lr81;
.super Ler4;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final s:Landroid/graphics/RectF;


# direct methods
.method public constructor <init>(La77;Landroid/graphics/RectF;)V
    .locals 0

    .line 9
    invoke-direct {p0, p1}, Ler4;-><init>(Ly67;)V

    .line 10
    iput-object p2, p0, Lr81;->s:Landroid/graphics/RectF;

    return-void
.end method

.method public constructor <init>(Lr81;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ler4;-><init>(Ler4;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p1, Lr81;->s:Landroid/graphics/RectF;

    .line 5
    .line 6
    iput-object p1, p0, Lr81;->s:Landroid/graphics/RectF;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final newDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    new-instance v0, Ls81;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lgr4;-><init>(Ler4;)V

    .line 4
    .line 5
    .line 6
    iput-object p0, v0, Lt81;->I0:Lr81;

    .line 7
    .line 8
    invoke-virtual {v0}, Lgr4;->invalidateSelf()V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method
