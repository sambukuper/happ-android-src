.class public final synthetic Ldx1;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic X:Ly5;

.field public final synthetic Y:Lcj0;

.field public final synthetic Z:Lcj0;

.field public final synthetic f0:Lxx7;

.field public final synthetic g0:Lxx7;

.field public final synthetic h0:Ljava/util/Map$Entry;


# direct methods
.method public synthetic constructor <init>(Ly5;Lcj0;Lcj0;Lxx7;Lxx7;Ljava/util/Map$Entry;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldx1;->X:Ly5;

    .line 5
    .line 6
    iput-object p2, p0, Ldx1;->Y:Lcj0;

    .line 7
    .line 8
    iput-object p3, p0, Ldx1;->Z:Lcj0;

    .line 9
    .line 10
    iput-object p4, p0, Ldx1;->f0:Lxx7;

    .line 11
    .line 12
    iput-object p5, p0, Ldx1;->g0:Lxx7;

    .line 13
    .line 14
    iput-object p6, p0, Ldx1;->h0:Ljava/util/Map$Entry;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget-object v4, p0, Ldx1;->g0:Lxx7;

    .line 2
    .line 3
    iget-object v5, p0, Ldx1;->h0:Ljava/util/Map$Entry;

    .line 4
    .line 5
    iget-object v0, p0, Ldx1;->X:Ly5;

    .line 6
    .line 7
    iget-object v1, p0, Ldx1;->Y:Lcj0;

    .line 8
    .line 9
    iget-object v2, p0, Ldx1;->Z:Lcj0;

    .line 10
    .line 11
    iget-object v3, p0, Ldx1;->f0:Lxx7;

    .line 12
    .line 13
    invoke-virtual/range {v0 .. v5}, Ly5;->B(Lcj0;Lcj0;Lxx7;Lxx7;Ljava/util/Map$Entry;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
