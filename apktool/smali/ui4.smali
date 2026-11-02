.class public final Lui4;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lyr4;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Ljava/util/Map;

.field public final synthetic d:Lgn2;

.field public final synthetic e:Lgn2;

.field public final synthetic f:Lvi4;


# direct methods
.method public constructor <init>(IILjava/util/Map;Lgn2;Lgn2;Lvi4;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lui4;->a:I

    .line 5
    .line 6
    iput p2, p0, Lui4;->b:I

    .line 7
    .line 8
    iput-object p3, p0, Lui4;->c:Ljava/util/Map;

    .line 9
    .line 10
    iput-object p4, p0, Lui4;->d:Lgn2;

    .line 11
    .line 12
    iput-object p5, p0, Lui4;->e:Lgn2;

    .line 13
    .line 14
    iput-object p6, p0, Lui4;->f:Lvi4;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 0

    .line 1
    iget p0, p0, Lui4;->b:I

    .line 2
    .line 3
    return p0
.end method

.method public final b()I
    .locals 0

    .line 1
    iget p0, p0, Lui4;->a:I

    .line 2
    .line 3
    return p0
.end method

.method public final c()Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, Lui4;->c:Ljava/util/Map;

    .line 2
    .line 3
    return-object p0
.end method

.method public final d()V
    .locals 1

    .line 1
    iget-object v0, p0, Lui4;->f:Lvi4;

    .line 2
    .line 3
    iget-object v0, v0, Lvi4;->r0:Lwi4;

    .line 4
    .line 5
    iget-object p0, p0, Lui4;->e:Lgn2;

    .line 6
    .line 7
    invoke-interface {p0, v0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final g()Lgn2;
    .locals 0

    .line 1
    iget-object p0, p0, Lui4;->d:Lgn2;

    .line 2
    .line 3
    return-object p0
.end method
