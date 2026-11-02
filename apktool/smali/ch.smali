.class public final Lch;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lq38;


# instance fields
.field public final a:Landroid/view/View;

.field public final b:Lgn2;

.field public final c:Ldn2;

.field public final d:Lm15;

.field public final e:Lxd7;

.field public final f:Lxg;

.field public final g:Lxg;

.field public h:Landroid/view/ActionMode;

.field public i:Lj0;

.field public j:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Landroid/view/View;Lgn2;Ldn2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lch;->a:Landroid/view/View;

    .line 5
    .line 6
    iput-object p2, p0, Lch;->b:Lgn2;

    .line 7
    .line 8
    iput-object p3, p0, Lch;->c:Ldn2;

    .line 9
    .line 10
    new-instance p1, Lm15;

    .line 11
    .line 12
    invoke-direct {p1}, Lm15;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lch;->d:Lm15;

    .line 16
    .line 17
    new-instance p1, Lxd7;

    .line 18
    .line 19
    new-instance p2, Lxg;

    .line 20
    .line 21
    const/4 p3, 0x0

    .line 22
    invoke-direct {p2, p0, p3}, Lxg;-><init>(Lch;B)V

    .line 23
    .line 24
    .line 25
    invoke-direct {p1, p2}, Lxd7;-><init>(Lgn2;)V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lch;->e:Lxd7;

    .line 29
    .line 30
    new-instance p1, Lxg;

    .line 31
    .line 32
    const/4 p2, 0x1

    .line 33
    invoke-direct {p1, p0, p2}, Lxg;-><init>(Lch;B)V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, Lch;->f:Lxg;

    .line 37
    .line 38
    new-instance p1, Lxg;

    .line 39
    .line 40
    const/4 p2, 0x2

    .line 41
    invoke-direct {p1, p0, p2}, Lxg;-><init>(Lch;B)V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, Lch;->g:Lxg;

    .line 45
    .line 46
    return-void
.end method


# virtual methods
.method public final a(Lh38;Luy7;)Ljava/lang/Object;
    .locals 6

    .line 1
    new-instance v3, Lda;

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    const/4 v4, 0x0

    .line 5
    invoke-direct {v3, p0, p1, v4, v0}, Lda;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 6
    .line 7
    .line 8
    iget-object v2, p0, Lch;->d:Lm15;

    .line 9
    .line 10
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    new-instance v0, Lkg3;

    .line 14
    .line 15
    const/4 v5, 0x1

    .line 16
    sget-object v1, Lf15;->X:Lf15;

    .line 17
    .line 18
    invoke-direct/range {v0 .. v5}, Lkg3;-><init>(Lf15;Ljava/lang/Object;Lgn2;Lq51;B)V

    .line 19
    .line 20
    .line 21
    invoke-static {v0, p2}, Lgv3;->n(Lrn2;Lq51;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    sget-object p1, Lc71;->X:Lc71;

    .line 26
    .line 27
    if-ne p0, p1, :cond_0

    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_0
    sget-object p0, Ldn8;->a:Ldn8;

    .line 31
    .line 32
    return-object p0
.end method
