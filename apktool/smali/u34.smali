.class public final Lu34;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lyr4;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Ljava/util/Map;

.field public final synthetic d:Lgn2;

.field public final synthetic e:Lv34;

.field public final synthetic f:Lb44;

.field public final synthetic g:Lgn2;


# direct methods
.method public constructor <init>(IILjava/util/Map;Lgn2;Lv34;Lb44;Lgn2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lu34;->a:I

    .line 5
    .line 6
    iput p2, p0, Lu34;->b:I

    .line 7
    .line 8
    iput-object p3, p0, Lu34;->c:Ljava/util/Map;

    .line 9
    .line 10
    iput-object p4, p0, Lu34;->d:Lgn2;

    .line 11
    .line 12
    iput-object p5, p0, Lu34;->e:Lv34;

    .line 13
    .line 14
    iput-object p6, p0, Lu34;->f:Lb44;

    .line 15
    .line 16
    iput-object p7, p0, Lu34;->g:Lgn2;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 0

    .line 1
    iget p0, p0, Lu34;->b:I

    .line 2
    .line 3
    return p0
.end method

.method public final b()I
    .locals 0

    .line 1
    iget p0, p0, Lu34;->a:I

    .line 2
    .line 3
    return p0
.end method

.method public final c()Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, Lu34;->c:Ljava/util/Map;

    .line 2
    .line 3
    return-object p0
.end method

.method public final d()V
    .locals 2

    .line 1
    iget-object v0, p0, Lu34;->f:Lb44;

    .line 2
    .line 3
    iget-object v0, v0, Lb44;->X:Landroidx/compose/ui/node/LayoutNode;

    .line 4
    .line 5
    iget-object v1, p0, Lu34;->e:Lv34;

    .line 6
    .line 7
    invoke-virtual {v1}, Lv34;->c0()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    iget-object p0, p0, Lu34;->g:Lgn2;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    iget-object v1, v0, Landroidx/compose/ui/node/LayoutNode;->H0:Lt6;

    .line 16
    .line 17
    iget-object v1, v1, Lt6;->f0:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, Lfd3;

    .line 20
    .line 21
    iget-object v1, v1, Lfd3;->f1:Led3;

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    iget-object v0, v1, Lvi4;->r0:Lwi4;

    .line 26
    .line 27
    invoke-interface {p0, v0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    iget-object v0, v0, Landroidx/compose/ui/node/LayoutNode;->H0:Lt6;

    .line 32
    .line 33
    iget-object v0, v0, Lt6;->f0:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, Lfd3;

    .line 36
    .line 37
    iget-object v0, v0, Lvi4;->r0:Lwi4;

    .line 38
    .line 39
    invoke-interface {p0, v0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public final g()Lgn2;
    .locals 0

    .line 1
    iget-object p0, p0, Lu34;->d:Lgn2;

    .line 2
    .line 3
    return-object p0
.end method
