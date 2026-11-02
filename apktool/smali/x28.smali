.class public final Lx28;
.super Lwl7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final synthetic g:La38;

.field public final synthetic h:Lz28;


# direct methods
.method public constructor <init>(Lz28;La38;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lx28;->h:Lz28;

    .line 5
    .line 6
    iput-object p2, p0, Lx28;->g:La38;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final S(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lx28;->h:Lz28;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iput-boolean v1, v0, Lz28;->n:Z

    .line 5
    .line 6
    iget-object p0, p0, Lx28;->g:La38;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, La38;->d(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final T(Landroid/graphics/Typeface;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lx28;->h:Lz28;

    .line 2
    .line 3
    iget v1, v0, Lz28;->d:I

    .line 4
    .line 5
    invoke-static {p1, v1}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, v0, Lz28;->p:Landroid/graphics/Typeface;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    iput-boolean v1, v0, Lz28;->n:Z

    .line 13
    .line 14
    iget-object p0, p0, Lx28;->g:La38;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-virtual {p0, p1, v0}, La38;->e(Landroid/graphics/Typeface;Z)V

    .line 18
    .line 19
    .line 20
    return-void
.end method
