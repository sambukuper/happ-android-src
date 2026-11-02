.class public final Lkh3;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lyr4;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Ljava/util/Map;

.field public final synthetic d:Lgn2;


# direct methods
.method public constructor <init>(IILjava/util/Map;Lgn2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lkh3;->a:I

    .line 5
    .line 6
    iput p2, p0, Lkh3;->b:I

    .line 7
    .line 8
    iput-object p3, p0, Lkh3;->c:Ljava/util/Map;

    .line 9
    .line 10
    iput-object p4, p0, Lkh3;->d:Lgn2;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 0

    .line 1
    iget p0, p0, Lkh3;->b:I

    .line 2
    .line 3
    return p0
.end method

.method public final b()I
    .locals 0

    .line 1
    iget p0, p0, Lkh3;->a:I

    .line 2
    .line 3
    return p0
.end method

.method public final c()Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, Lkh3;->c:Ljava/util/Map;

    .line 2
    .line 3
    return-object p0
.end method

.method public final d()V
    .locals 0

    .line 1
    return-void
.end method

.method public final g()Lgn2;
    .locals 0

    .line 1
    iget-object p0, p0, Lkh3;->d:Lgn2;

    .line 2
    .line 3
    return-object p0
.end method
