.class public final Lci1;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lu27;


# instance fields
.field public final a:Ljava/lang/CharSequence;

.field public final b:I

.field public final c:Lrn2;


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;ILrn2;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lci1;->a:Ljava/lang/CharSequence;

    .line 8
    .line 9
    iput p2, p0, Lci1;->b:I

    .line 10
    .line 11
    iput-object p3, p0, Lci1;->c:Lrn2;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    new-instance v0, Lbi1;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lbi1;-><init>(Lci1;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
